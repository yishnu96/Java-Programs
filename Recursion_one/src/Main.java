import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//String input = s.nextLine();
		//System.out.println(Recurssion.isStringPalindrome(input));
		
		int n = s.nextInt();
		System.out.println(Recurssion.countZerosRec(n));
	}

}
