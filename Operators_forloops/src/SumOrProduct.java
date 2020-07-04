import java.util.Scanner;
public class SumOrProduct {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		int c = in.nextInt();
		boolean flag=false;
		
		
		int sum=0,pdt=1;
		for(int i=1;i<=n;i++)
		{
				sum =sum +i;
				pdt= pdt*i;
		}
		
		if(c==1)
			System.out.println(sum);
		else if(c==2)
			System.out.println(pdt);
		else
			System.out.println("-1");
		
	}
}
