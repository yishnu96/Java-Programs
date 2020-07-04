package time_complexity;

import java.util.Arrays;

public class Intersection {
	
	public static boolean binarySearch(int[] arr, int num) {
		
		int start=0,end=arr.length-1;
		
		while(start <= end)
		{
			int mid = (start+end)/2;
			
			if(num > arr[mid] )
				start=mid+1;
			else if(num < arr[mid])
				end=mid-1;
			else
				return true;
		}
		return false;
	}

	public static void intersection(int[] arr1, int[] arr2) {
	
		int n1 =arr1.length,n2=arr2.length;
		int l;
		
		if(n1<n2) {
			Arrays.sort(arr1);
		}
		else {
			Arrays.sort(arr2);
		}
			
		for( int i = 0;i<n1 || i<n2;i++)
		{
			if(n1<n2) 
			{
				if(Intersection.binarySearch(arr1, arr2[i]))
					System.out.print(arr2[i] + " ");
			}
			else
			{
				if(Intersection.binarySearch(arr2, arr1[i]))
					System.out.print(arr2[i] + " ");
			}
		}
	}

}
