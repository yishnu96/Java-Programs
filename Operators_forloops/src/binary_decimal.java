import java.util.Scanner;
public class binary_decimal {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		
		//int bin=in.nextInt();
		//int pv=1,dec=0,rim;
		
		/*
		 * Binary to decimal
		 * while(bin>0)
		{
			rim=bin%10;
			dec=dec+rim*pv;
			bin=bin/10;
			pv=pv*2;
		}
		System.out.println(dec);*/
		
		//Decimal to binary
		int n=in.nextInt();
		int rem,y=0;
		long s2=0;
		if(n<0)
		{
			System.out.println("0");
			return;
		}
		while(n!=0)
		{
			rem=n%2;
			s2=s2+rem*(long)(Math.pow(10, y++));
			n/=2;
		}
		System.out.println(s2);
	}
}
