import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int rim,rev=0;
		while(n>0)
		{
			rim=n%10;
			rev = rev*10+rim;
			n=n/10;
		}
		System.out.println(rev);
	}
}
