/*Sample Input 1 :
3
Sample Output 1 :
135
351
513			*/


import java.util.Scanner;
public class Odd_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int rows = in.nextInt();
		
		for(int i = 1;i<=rows;i++)
		{
			for(int j = 2*i-1;j<=2*rows;j+=2)
			{
				System.out.print(j);
			}
			for(int j = 1;j<2*i-1;j+=2)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
