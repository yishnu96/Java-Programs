package search;

public class SecondLargest {

	public static int secondLargestElement(int[] arr) {
		// TODO Auto-generated method stub
		int first = Integer.MIN_VALUE,second=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				second = first;
				first =arr[i];
			}
		}
		return second;
	}

}
