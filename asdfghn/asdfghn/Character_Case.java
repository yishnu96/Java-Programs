package asdfghn;
import java.util.Scanner;
public class Character_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		char ch = in.next().charAt(0);
		
		if(ch>='a' && ch<='z')
		{
			System.out.print("0");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.print("1");
		}
		else
		{
			System.out.print("-1");
		}
		
	}

}
