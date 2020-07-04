package two_dimentional_array;

public class Largest {

	public static void findLargest(int[][] arr) {
		// TODO Auto-generated method stub
		
		int row=arr.length;
		int col = arr[0].length;
		
		int max_row=-1,max_col=-1;
		int row_num = -1,col_num=-1;
		
		for(int i=0;i<row;i++)
		{
			int sum_row=0;
			for(int j=0;j<col;j++)
			{
				sum_row= sum_row+arr[i][j];
			}
			if(sum_row>max_row)
			{
				max_row =sum_row;
				row_num = i;
			}
		}
		

		for(int i=0;i<col;i++)
		{
			int sum_col=0;
			for(int j=0;j<row;j++)
			{
				sum_col=sum_col+arr[j][i];
			}
			if(sum_col>max_col)
			{
				max_col=sum_col;
				col_num=i;
			}
		}
		
		if(max_row>max_col)
			System.out.println("row "+ row_num + " "+ max_row);
		else
			System.out.println("column "+ col_num + " "+ max_col);
		
	}
}
