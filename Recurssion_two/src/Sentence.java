
public class Sentence {

	public static String replaceCharacter(String input, char c1, char c2) {
		
		if(input.length()==0)
			return input;
		
		String ans="";
		if(input.charAt(0) == c1)
			ans=ans+c2;
		else
			ans=ans+input.charAt(0);
			
		return ans+replaceCharacter(input.substring(1), c1, c2);
	}

	
	public static String removeConsecutiveDuplicates(String input) {
		
		String ans = "";
		if(input.length()==1)
			return "";
		
		if(input.charAt(0)==input.charAt(1))
			ans = ans + "";
		else
			ans=ans+input.charAt(0);
		
		return ans+removeConsecutiveDuplicates(input.substring(1));
	}


	public static String removeX(String input) {

		String ans = "";
		if(input.length()==0)
			return input;
		
		if(input.charAt(0)== 'x')
			ans = ans + "";
		else
			ans=ans+input.charAt(0);
		
		return ans+removeX(input.substring(1));
		
	}


	public static String addStars(String input) {
		// TODO Auto-generated method stub
		String ans = "";
		if(input.length()==1)
			return input;
		
		if(input.charAt(0)==input.charAt(1)) {
			ans = ans + input.charAt(0)+'*';
		}
		else {
			ans=ans+input.charAt(0);
		}
		
		return ans+addStars(input.substring(1));
	}


	
	
	public static String replace(String input) {
		
		String ans = "";
		if(input.length()==0)
			return "";
		
		if(input.charAt(0)=='p' && input.charAt(1)=='i')
		{
			ans=ans+"3.14";
			return ans+replace(input.substring(2));
		}
			
		else {
			ans=ans+input.charAt(0);
			return ans+replace(input.substring(1));
		}
		
	}


	public static int convertStringToInt(String str) {
		
		if (str.length() == 1) 
            return (str.charAt(0) - '0'); 
  
        double y = convertStringToInt(str.substring(1));
  
        double x = str.charAt(0) - '0'; 
  
        x = x * Math.pow(10, str.length() - 1) + y; 
        return (int)(x); 
	}

	
}
