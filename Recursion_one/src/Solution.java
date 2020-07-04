import java.util.Arrays;

public class Solution {

	public static int sum(int[] input) {
		
		if(input.length <=0)
			return 0 ;
		
		int smallinput[]=new int[input.length - 1];
		for(int i=0;i<smallinput.length;i++)
			smallinput[i]=input[i];
		return (sum(smallinput)+ input[input.length-1]);
	}

	
	public static boolean checkNumber(int[] input, int x) {
		
		boolean ans;
		if(input.length <=0)
			return false;
		else if (input[input.length-1]==x)
			return true;
		else {
			int[] smallarr=new int[input.length-1];
			for (int i = 0; i < smallarr.length; i++) {
				 smallarr[i]=input[i];
				
			}
			return ans=checkNumber(smallarr, x);
		}
	}

	
	public static int firstIndex(int[] input, int x) {
		
		return Solution.firstIndex(input,0, x);
	}

	private static int firstIndex(int[] input, int i, int x) {
		
		if(i==input.length)
			return -1;
		
		else if(input[i]==x)
			return i;
		
		return firstIndex(input, i+1, x);
	}
	
	

	public static int lastIndex(int[] input, int x) {
		return lastIndex(input,input.length-1, x);
	}

	private static int lastIndex(int[] input, int i, int x) {
		
		if(i==input.length)
			return -1;
		
		else if(input[i]==x)
			return i;
		
		return lastIndex(input, i-1, x);
	}
	
	


	public static int[] allIndexes(int[] arr, int x) {
		return allIndexes(arr, x,0);
	}

	private static int[] allIndexes(int[] arr, int x, int start) {
		if (start == arr.length) { 
            int[] ans = new int[0]; // empty array 
            return ans; 
        } 
  
		int[] smallIndex = allIndexes(arr, x, start+1);
  
        if (arr[start] == x) { 
            int[] Ans = new int[smallIndex.length + 1]; 
  
            Ans[0] = start; 
            for (int i = 0; i < smallIndex.length; i++) 
                Ans[i + 1] = smallIndex[i]; 
            
            return Ans; 
        } 
        else 
            return smallIndex; 
	}

	
}
