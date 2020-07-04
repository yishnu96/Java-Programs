
public class StringSoln {

	public static boolean checkAB(String input) {

		if(input.length()<=1)
			return true;
        
        if(input.charAt(0)=='a'&& input.charAt(1)=='a')
			return checkAB(input.substring(1));
        
        if(input.charAt(0)=='a' && input.charAt(1)=='b' && input.charAt(2) =='b')
			return checkAB(input.substring(3));
		
		return false;
        
	}

	public static String[] permutationOfString(String input) {

		if(input.length()==0)
		{
			String[] Output = {""};
			return Output;
		}
		
		String[] str = permutationOfString(input.substring(1));
		String[] output=new String[str.length * input.length()];
		int k=0;
		
		for (int i = 0; i < str.length; i++) {
			String CurrStr = str[i];
			for (int j = 0; j <= CurrStr.length(); j++) {
				String newString = CurrStr.substring(0, j)+ input.charAt(0)+CurrStr.substring(j);
				output[k]=newString;
				k++;
			}
			
		}
		
		return output;
	}

}
