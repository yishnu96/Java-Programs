
public class Rat {

	public static boolean ratInAMaze(int[][] maze) {
		
		int n = maze.length;
		int path[][] = new int[n][n];
		return ratInAMaze(maze,0,0,path);
		
	}

	private static boolean ratInAMaze(int[][] maze, int i, int j, int[][] path) {
		
		int n = maze.length;
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j] ==0 ||path[i][j] == 1)
			return false;
		
		path[i][j]=1;
		
		if(i==n-1 && j==n-1)
			return true;
		
		if(ratInAMaze(maze, i-1, j, path))
			return true;
		
		if(ratInAMaze(maze, i, j+1, path))
			return true;
			
		if(ratInAMaze(maze, i+1, j, path))
			return true;
			
		if(ratInAMaze(maze, i, j-1, path))
			return true;
		
		return false;
	}

	public static void printratInMaze(int[][] maze) {
		int n = maze.length;
		int path[][] = new int[n][n];
		printratInMaze(maze,0,0,path);
	}

	private static void printratInMaze(int[][] maze, int i, int j, int[][] path) {
		
		int n = maze.length;
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j] ==0 ||path[i][j] == 1)
			return;
		
		path[i][j]=1;
		
		
		if(i==n-1 && j==n-1)
		{
			for (int r = 0; r < path.length; r++) {
				
				for (int c = 0; c < path.length; c++) 
					System.out.print(path[r][c] + " ");
				
				System.out.println();
			}
			System.out.println();
			path[i][j] = 0;
			return;
		}
		
		printratInMaze(maze, i-1, j, path);
		printratInMaze(maze, i, j+1, path);
		printratInMaze(maze, i+1, j, path);
		printratInMaze(maze, i, j-1, path);
		path[i][j] = 0;
	}

}

































