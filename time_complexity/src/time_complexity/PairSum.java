package time_complexity;

import java.util.Arrays;

public class PairSum {

	public static void pairSum(int[] arr, int num) {
		
		Arrays.parallelSort(arr);
		int i=0,j=arr.length-1;
		
		
		while(i<j)
		{
			if(arr[i]+arr[j] == num) {
				while((arr[i]+arr[j]==num) && arr[j]==arr[j-1])
				{
					System.out.println(arr[i]+" "+arr[j]);
					j--;
				}
				i++;j--;
			}
			
			else if(arr[i]+arr[j] > num)
				j--;
			
			else
				i++;
		}
	}
}
