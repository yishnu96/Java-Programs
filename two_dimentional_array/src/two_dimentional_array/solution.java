package two_dimentional_array;

public class solution {

	public static void spiralPrint(int[][] a) {
		
		int end_row=a.length;
		int end_col=a[0].length;
		int i,s_row=0,s_col=0;
		
		while (s_row < end_row && s_col < end_col) { 

            for (i = s_col; i < end_col; ++i) {
            	if(a[s_row][i] == Integer.MAX_VALUE)
            		continue;
            	else {
            		System.out.print(a[s_row][i] + " "); 
                	a[s_row][i] = Integer.MAX_VALUE;
            	}
                
            } 
            s_row++; 
  
            for (i = s_row; i < end_row; ++i) { 
            	if(a[i][end_col - 1]==Integer.MAX_VALUE)
            		continue;
            	else {
            		System.out.print(a[i][end_col - 1] + " "); 
            		a[i][end_col - 1] = Integer.MAX_VALUE;
            	}
            } 
            end_col--; 
  
            if (s_row < end_row) { 
                for (i = end_col - 1; i >= s_col; --i) { 
                	if(a[end_row - 1][i] == Integer.MAX_VALUE)
                		continue;
                	else {

                        System.out.print(a[end_row - 1][i] + " "); 
                		a[end_row - 1][i] = Integer.MAX_VALUE;
                	}
                } 
                end_row--; 
            } 
  
            if (s_col < end_col) { 
                for (i = end_row - 1; i >= s_row; --i) { 
                	if(a[i][s_col]==Integer.MAX_VALUE)
                		continue;
                	else {
                		System.out.print(a[i][s_col] + " "); 
                		a[i][s_col]=Integer.MAX_VALUE;
                	}
                } 
                s_row++;
            }
            
		}
	}

	public static void wavePrint(int[][] arr) {
		// TODO Auto-generated method stub
		
		int row =arr.length;
		int col = arr[0].length;
		
		for(int i = 0;i<row;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<col;j++)
					System.out.print(arr[j][i]+ " ");
			}
			else
			{
				for(int j=col-1;j>=0;j--)
					System.out.print(arr[j][i]+ " ");
			}
		}
		
		
	}
}
