import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		boolean flag=false;
		int a=1,b=0,s;
		for(int i = 0;i<=n;i++)
		{
			s=a+b;
			a=b;
			b=s;
			System.out.println(s);
			if(s==n)
			{
				flag=true;
			}
		}
		System.out.println(flag);
	
	}

}
