import java.util.Scanner;
public class Half_dimond {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n= in.nextInt();
		
		if(n==0)
			System.exit(0);
		//upper
		for(int i = 1;i<=n+1;i++) {
			System.out.print("*");
			if(i>1)
			{
				int j;
				for(j=1;j<=i-1;j++) {
					System.out.print(j);
				}
				for(j=i-2;j>0;j--)
					System.out.print(j);
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower
		for(int i = n;i>=1;i--)
		{
			System.out.print("*");
			if(i>1) {
				
				int j;
				for(j=1;j<i;j++)
					System.out.print(j);
				
				for(j=i-2;j>0;j--)
					System.out.print(j);
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
