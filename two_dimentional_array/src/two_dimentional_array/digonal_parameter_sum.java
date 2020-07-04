package two_dimentional_array;
import java.util.*;

public class digonal_parameter_sum {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Row and Colom");
		int numRows = in.nextInt();
		
		System.out.println("Enter Matrix \n");
		int[][] input = new int[numRows][numRows];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numRows; j++){
				input[i][j] = in.nextInt();
			}
		}
		
		int sum=0;
		for(int i=0;i< numRows;i++)
		{
			for(int j = 0;j<numRows;j++)
			{
				if((i==j) || (i+j == numRows-1) || (i==0)||(j==0)||(i==numRows-1)||(j==numRows-1))
				{
					sum = sum + input[i][j];
					input[i][j]=0;
				}
			}
		}
		System.out.println(sum);
	}
}
