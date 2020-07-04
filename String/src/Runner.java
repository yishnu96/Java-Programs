import java.util.Scanner;
public class Runner {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = s.nextLine();
		
		//System.out.println(Count.countWords(str));
		
		//System.out.println(Check.checkPalindrome(str));
		
		//Count.printSubstrings(str);
		
		//System.out.println(ReverseWord.reverseWordWise(str));
		System.out.println(ReverseWord.reverseEachWord(str));
	}
}
