package asdfghn;
import java.util.Scanner;
public class power {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x=in.nextInt();
		int n=in.nextInt();
		
		int num=1;
		if(n==0) {
			num=1;
		}
		else {
		while(n>0)
		{
			 num = num * x;
			 n--;
		}
		}
		System.out.print(num);
	}

}
