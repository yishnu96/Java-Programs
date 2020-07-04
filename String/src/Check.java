
public class Check {

	public static boolean checkPalindrome(String str) {
		// TODO Auto-generated method stub
		
		int i=0,j=str.length()-1;
		while(i<str.length()/2)
		{
			if(str.charAt(i)!=str.charAt(j))
				return false;
			else {
				i++;
				j--;
			}
			
		}
		return true;
	}

}
