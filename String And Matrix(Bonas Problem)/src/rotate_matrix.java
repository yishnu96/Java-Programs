import java.util.Scanner;

public class rotate_matrix {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[][] = new int[n][n];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				arr[i][j] = s.nextInt();
		rotate(arr);	
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void rotate(int[][] input) {
		
		int n = input.length;
		
		for (int x = 0; x < n / 2; x++) { 
            for (int y = x; y < n - x - 1; y++) { 
                int temp = input[x][y]; 
  
                input[x][y] = input[y][n - 1 - x]; 
                input[y][n - 1 - x] = input[n - 1 - x][n - 1 - y]; 
                input[n - 1 - x][n - 1 - y] = input[n - 1 - y][x]; 
                input[n - 1 - y][x] = temp; 
            } 
        } 
		
	}
	
}
