package time_complexity;

import java.util.Arrays;

public class DuplicateInArray {

	public static int duplicate(int[] arr) {
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1] || arr[i-1]==arr[i])
				return arr[i];
		}
		return 0;
		
		
		}
		return 0;
	}

}
