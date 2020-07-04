package time_complexity;

import java.util.Arrays;

public class FindUnique {

	public static int findUnique(int[] arr) {

		Arrays.parallelSort(arr);
		int i=0;
		while(i<arr.length)
		{
			if(arr[i]!=arr[i+1])
				return arr[i];
			i+=2;
		}
		
		return 0;
	}

}
