import java.util.Arrays;

public class solution {

	public static void print2DArray(int[][] input) {

		for (int i = 0; i < input.length; i++) {
			int irr = input.length-i;
			while(irr>=0) {
			for (int j = 0; j < input[0].length; j++) {
				
					System.out.print(input[i][j] + " ");
					
				}
			irr--;
			System.out.println();
			}
			
		}
		
	}

	public static int maximumProfit(int[] input) {

		Arrays.sort(input);
		int max = 0;
		
		for(int i=0;i<input.length;i++)
		{
			int sum = 0;
			sum = input[i] * (input.length-i);
			if(sum > max)
				max=sum;
		}
		return max;
	}

	
	public static boolean splitArray(int[] arr, int pos, int sumL, int sumR) {

		if(pos == arr.length)
			return sumL == sumR;
		
		if (arr[pos] % 5 == 0) 
	        sumL += arr[pos]; 
	  
	    else if (arr[pos] % 3 == 0) 
	        sumR += arr[pos]; 
	  
	    else {
	    	boolean x = splitArray(arr, pos+1, sumL + arr[pos], sumR);
	    	boolean y = splitArray(arr, pos+1, sumL, sumR + arr[pos]);
	    	return x || y;
	    }
		
		return splitArray(arr, pos + 1, sumL, sumR);
	}

	
	
	public static int minCount(int n) {
		if (n <= 3) 
            return n; 
  
        int res = n; 
        
        for (int x = 1; x <= n; x++) { 
            int temp = x * x; 
            if (temp > n) 
                break; 
            else
                res = Math.min(res, 1 + minCount(n-temp)); 
        } 
        return res; 
	}

	

}
