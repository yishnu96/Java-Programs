
public class Recurssion {

	public static boolean isStringPalindrome(String input) {
		if(input.length()==0)
			return true;
		
		return isStringPalindrome(input,0,input.length()-1);
	}

	private static boolean isStringPalindrome(String input, int i, int j) {

		if(i>=j)
			return true;
		
		if(input.charAt(i)==input.charAt(j))
			return isStringPalindrome(input, i+1, j-1);
		
		return false;
	}

	
	public static int countZerosRec(int n) {
		if(n==0)
			return 0;
		
		if(n%10 == 0)
			return 1+countZerosRec(n/10);

		return countZerosRec(n/10);
	}

}
