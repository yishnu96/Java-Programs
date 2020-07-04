/*Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15		*/

import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=1;i<=n;i++)
		{	
			int sum=0;
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				sum=sum+j;
				if(j<i)
				{
					System.out.print("+");
				}
				else
				{
					System.out.print("=");
				}
			}
			System.out.print(sum);
			System.out.println();
		}
	}

}
