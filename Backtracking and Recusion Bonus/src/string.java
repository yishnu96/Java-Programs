
public class string {

	public static void printAllPossibleStrings(String str,String output) {

		if(str.length()==0)
		{
			System.out.println(output);
			return;
		}
		
		if(str.charAt(0)=='?')
		{
			printAllPossibleStrings(str.substring(1),output+'0');
			printAllPossibleStrings(str.substring(1),output+'1');
		}
		else
			printAllPossibleStrings(str.substring(1),output+str.charAt(0));
		
	}

	public static void printAllPossibleStrings(String str) {
		printAllPossibleStrings(str,"");
		
	}

	
	static void printBinary(String output, int i, int n) 
	{ 
		if (0 == n)  
		{ 
			System.out.println( output ); 
			return; 
		} 

		printBinary(output + "1", i + 1, n - 1); 

		if (0 < i)  
			printBinary(output + "0", i - 1, n - 1);  
	} 

	public static void find(int digits, int sum) {

		String ans = "";
		for (int k = 1; k <= 9; k++) 
		{ 
			ans =ans+ (char)(k + 48); 
			find(digits, sum - k, ans, 1); 
		}
	}

	private static void find(int digit, int sum, String ans, int i) {
		
        if (i > digit || sum < 0) 
            return; 
   
        if (i == digit) 
        { 
            if(sum == 0) 
            { 
                
                System.out.print(ans); 
                System.out.print(" "); 
            } 
            return; 
        } 
        for (int k = 0; k <= 9; k++) 
        { 
            ans = ans +(char)(k + '0'); 
   
            find(digit, sum - k, ans, i + 1); 
        } 
	}

	public static void answer(String[] input) {
		answer(input,0,input[0]);		
	}

	private static void answer(String[] input, int i, String ans) {
		
		if(i == input.length)
		{
			System.out.println(ans);
			return;
		}
		
		String string= input[i];
		String newans= "";
		for(int k=0; k < Math.min(ans.length(), string.length()); k++)
		{
			if(ans.charAt(k) == string.charAt(k))
				newans = newans + ans.charAt(k);
		}
		
		answer(input, i+1, newans);
		
	}

	public static int numberOfWays(int[] arr, int i, int sum, String string) {
		
		if(i==arr.length && sum!=0)
			return 0;
		
		if(sum==0) {
			System.out.println(string);
			return 1;
		}
		
		string = (arr[i] + " ")+ string;
		
		
		int option1= numberOfWays(arr, i+1, sum-arr[i], string);
		int option2 = numberOfWays(arr, i+1, sum+arr[i], string);
		int option3 = numberOfWays(arr, i + 1, sum, string);
		
		return option1+option2+option3;
		
	}

	

}


























