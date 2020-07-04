package test_5;

public class mat {
	
	private int[][] matrix;
	private int row;
	private int col;
	
	public mat(int row,int col)
	{
		this.row = row;
		this.col = col;
		
		matrix = new int[row][col];
	}
	
	public mat(int[][] mat) {
		row = mat.length;
		col = mat[0].length;
		matrix = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = mat[i][j];
			}
		}
	}

	public static mat add(mat mat1, mat mat2) {
		if(mat1.row!=mat2.row || mat1.col!=mat2.col)
			System.out.println("Not possiable");
		
		mat result = new mat(mat1.row, mat1.col);
		
		for (int i = 0; i < result.row; i++) {
			for (int j = 0; j < result.col; j++) {
				result.matrix[i][j] = mat1.matrix[i][j] + mat2.matrix[i][j];
			}
		}
		return result;
	}
	
	public  void print()
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

	public static mat transpose(mat mat) {
		
		mat result = new mat(mat.row,mat.col);
		for(int i=0;i<mat.row;i++)
            for(int j=0;j<mat.col;j++)
            	result.matrix[j][i] = mat.matrix[i][j]; 
		return result;
	}
	
	private static void swap(int i, int j) {
		int temp = i;
		i=j;
		j=temp;
	}

	public static mat multiply(mat mat1, mat mat2) {
		mat result = new mat(mat1.row,mat2.col);
        for(int i = 0; i < mat1.row; i++) 
            for (int j = 0; j < mat2.col; j++) 
                for (int k = 0; k < mat1.col; k++)
                	result.matrix[i][j] += mat1.matrix[i][k] * mat2.matrix[k][j];
        return result;
	}

	public static mat rotate(mat mat) {
		
		-+
	}
	
	
	

}
