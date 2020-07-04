
public class Classwork {
	
	private static String key(int n) {
		
		String[] str = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		return str[n];
	}

	public static String[] keypad(int input) {
		
		if(input == 0) {
			String[] ans = {""};
			return ans;
		}
			
		String keyword=key(input%10);
		String[] ans = keypad(input/10);
		
		String[] output = new String[ans.length* keyword.length()];
		int k=0;
		
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < keyword.length(); j++) {
				output[k]= ans[i]+keyword.charAt(j);
				k++;
			}
		}
		return output;
	}

	
	public static void printKeypad(int input) {
		printKeypad(input,"");
	}

	private static void printKeypad(int n, String output) {
		
		if(n==0)
		{
			System.out.println(output);
			return;
		}
		
		String str = key(n%10);
		
		for (int i = 0; i < str.length(); i++) {
			printKeypad(n/10,str.charAt(i)+output);
		}
	}

	
}
