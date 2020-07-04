import java.util.Scanner;

public class binary_matrix {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int[][] arr = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) 
				arr[i][j] = s.nextInt();
		}
		
		modify(arr,m,n);
		print(arr,m,n);
	}

	private static void print(int[][] arr, int m, int n) {

		int i, j; 
		for (i = 0; i < m; i++) 
		{ 
			for (j = 0; j < n; j++) 
			{ 
				System.out.print(arr[i][j]+ " "); 
			} 
			System.out.println(); 
		} 

	}

	private static void modify(int[][] arr, int m, int n) {
		int row[ ]= new int [m]; 
        int col[ ]= new int [n]; 
        int i, j; 
      
        for (i = 0; i < m; i++) 
        { 
        row[i] = 0; 
        } 
      
        for (i = 0; i < n; i++) 
        { 
        col[i] = 0; 
        } 
      
        for (i = 0; i < m; i++) 
        { 
            for (j = 0; j < n; j++) 
            { 
                if (arr[i][j] == 1) 
                { 
                    row[i] = 1; 
                    col[j] = 1; 
                } 
            } 
        } 
      
        for (i = 0; i < m; i++) 
        { 
            for (j = 0; j < n; j++) 
            { 
                if ( row[i] == 1 || col[j] == 1 ) 
                { 
                    arr[i][j] = 1; 
                } 
            } 
        } 
		
	}
	
}
