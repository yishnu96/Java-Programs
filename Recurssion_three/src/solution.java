import java.util.Arrays;

public class solution {

	public static int binarySearch(int[] input, int element) {
		return binarySearch(input, element,0,input.length);
	}

	private static int binarySearch(int[] input, int element, int low, int high) {
		
		int mid = (low+high)/2;
		
		if(input[mid] == element)
			return mid;
		
		if(input[mid] > element)
			binarySearch(input, element, low, mid-1);
			
		if(input[mid] < element)
			binarySearch(input, element, mid + 1, high);
		
		return -1;
	}

	public static int[][] subsets(int[] input,int pos) {
		
		if(pos==input.length)
		{
			return new int[1][0];
		}
		
		int[][] arr = subsets(input,pos+1);
		int[][] ans = new int[2*arr.length][];
		
		int m=0,n=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			ans[m]=new int [arr[i].length];
			n=0;
			for (int j = 0; j < arr[i].length; j++) 
			{
				ans[m][n++]=arr[i][j];
			}m++;
		}
		
		
		for (int i = 0; i < arr.length; i++) 
		{
			ans[m]= new int [arr[i].length+1];
			ans[m][0] = input[pos];
			n=1;
			for (int j = 0; j < arr[i].length; j++) {
				ans[m][n++]=arr[i][j];
			}m++;
		}
		
		return ans;
	}

	
	
	public static int[][] subsetsSumK(int[] input, int pos, int num) {
		
		if(pos == input.length)
		{
			if(num == 0)
				return new int[1][0];
			else
				return new int[0][0];
		}
		
		int[][] temp1 = subsetsSumK(input, pos+1, num - input[pos]);
		int[][] temp2 = subsetsSumK(input, pos+1 , num);
		int[][] Output = new int[temp1.length + temp2.length ][];
		int m=0,n=0;

		for (int i = 0; i < temp2.length; i++) 
		{
			Output[m]  = new int[temp2[i].length];
			n=0;
			for (int j = 0; j < temp2[i].length; j++) 
				Output[m][n++] = temp2[i][j];
			m++;
		}
		
		for (int i = 0; i < temp1.length; i++) 
		{
			Output[m] = new int[temp1[i].length + 1];
			Output[m][0] = input[pos];		
			n=1;
			for (int j = 0; j < temp1[i].length; j++) 
				Output[m][n++] = temp1[i][j];
			m++;
		}
		
		return Output;
	}

	public static void printSubsetsSumTok(int[] input,int pos, int k) {
		
		if(pos== input.length)
		{
			return;
		}
			
		for (int i = pos+1; i < input.length; i++) {
			if(input[pos] + input[i] == k)
			{
				System.out.println(input[pos] +" "+input[i]);
				
			}
		}
		
		subsetsSumK(input, pos+1, k);
	}

}
