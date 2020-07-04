
public class queen {

	public static void placeNQueens(int n) {
		int[][] board = new int[n][n];	
		placeNQueens(board,0);
	}

	private static void placeNQueens(int[][] board, int row) {
		
		int n = board.length;
		if(row == n)
		{
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board.length; j++) {
					System.out.println(board[i][j]+ " ");
				}
				System.out.println();
			}
			System.out.println();
			return;
		}
		
		for (int i = 0; i < board.length; i++) {
			
			if(safe(board,row,i))
			{
				board[row][i] = 1;
				placeNQueens(board, row+1);
				board[row][i]=0;
			}
		}
		
		
	}

	private static boolean safe(int[][] board, int row, int col) {
		
		for (int i = 0; i < row; i++) {
			if(board[i][col] == 1)
				return false;
		}
		
		for(int i=row , j=col;i>=0 && j>=0;i--,j--)
			if(board[i][j] == 1)
				return false;
		
		for(int i=row , j=col;i>=0 && j<board.length;i--,j++)
			if(board[i][j] == 1)
				return false;
		
		return true;
	}

}
