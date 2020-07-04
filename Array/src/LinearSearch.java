
public class LinearSearch {
	public static int linearSearch(int[] arr, int num) {
		arr =new int[5];
		
		int n= arr.length;
		boolean flag=true;
		for(int i = 0;i<n;i++)
		{
			if(arr[i]==num)
			{
				num=i;
				flag=false;
				break;
			}
				
		}
		if(flag)
			return-1;
		else
			return num;
		
	}
}
