import java.util.Arrays;

public class solution {

	public static boolean isPermutation(String str1, String str2) {
		
	    if (str1.length() != str2.length())  
	    return false;  
	    char temp1[] = str1.toCharArray(); 
	    char temp2[] = str2.toCharArray(); 
	  
	    Arrays.sort(temp1);  
	    Arrays.sort(temp2);  
	  
	   // for (int i = 0; i < str1.length(); i++)  
	   // if (temp1[i] != temp2[i])  
	   //     return false;  
	    
	    temp1.equals(temp2);	    
	    return true;  
	}

	public static String removeAllOccurrencesOfChar(String str,char c) {

		int len =str.length();
		int count=0;
		
		String newstring =new String();
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)==c)
				continue;
			else
				newstring = newstring+str.charAt(i);
		}
		
		 return newstring;
	}

}
