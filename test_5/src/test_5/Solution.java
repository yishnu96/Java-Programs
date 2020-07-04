package test_5;

public class Solution {

	public static String[] allStrings(String charSet, int len) {
		
		if (len == 0)  
		{ 
			String[] output= {""};
			return output;
		} 

		String[] str = allStrings(charSet.substring(1), len-1);
		String[] output = new String[len*str.length];
		
		for (int i = 0; i < str.length; i++) {
			output[i] = str[i] + charSet.charAt(i);
		}
		
		return output;
	}
	
//	static String[] allStrings(String set, int k) 
//	{ 
//
//		if (k == 0)  
//		{ 
//			System.out.println(prefix); 
//			return; 
//		} 
//
//		for (int i = 0; i < n; ++i) 
//		{ 
//			String newPrefix = prefix + set[i];  
//
//			printAllKLengthRec(set, newPrefix, n, k - 1);  
//		} 
//	} 
}
