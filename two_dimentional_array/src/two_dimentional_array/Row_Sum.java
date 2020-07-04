package two_dimentional_array;

import java.util.Scanner;

public class Row_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter row and Coloum");
		int rows=s.nextInt();
		int col=s.nextInt();
		
		int[][] arr=new int[rows][col];
		
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[0].length;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		
		for(int i = 0;i<arr.length;i++)
		{	
			int sum=0;
			for(int j = 0;j<arr[0].length;j++)
			{
				sum = sum+ arr[i][j];
			}
			System.out.print(sum + " ");
		}
	}

}
