import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
//		int maze[][] = new int[n][n];
//		for(int i = 0; i < n; i++){
//			for(int j = 0; j < n; j++){
//				maze[i][j] = s.nextInt();
//			}
//		}
//		System.out.println(Rat.ratInAMaze(maze));	
//		Rat.printratInMaze(maze);
		queen.placeNQueens(n);
	}

}
