
public class ReverseWord {

	public static String reverseWordWise(String input) {
		// TODO Auto-generated method stub
		String[] words = input.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           /*String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
	           {
	        	   reverseWord = word.charAt(j)+reverseWord;
	           }*/
		   reversedString =  word + " "+ reversedString ;
		}
		
		return reversedString;
	}

	public static String reverseEachWord(String str) {
		// TODO Auto-generated method stub
		String[] words = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
	           {
	        	   reverseWord = reverseWord + word.charAt(j);
	           }
		   reversedString = reversedString +reverseWord +" " ;
		}
		
		return reversedString;
	}

}
