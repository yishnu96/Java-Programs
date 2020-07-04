package search;

public class BinarySearch {

	public static int binarySearch(int[] arr, int num) {
		// TODO Auto-generated method stub
		
		int start=0,end=arr.length-1;
		
		while(start <= end)
		{
			int mid = (start+end)/2;
			
			if(num > arr[mid] )
				start=mid+1;
			else if(num < arr[mid])
				end=mid-1;
			else
				return mid;
		}
		return -1;
	}

}
