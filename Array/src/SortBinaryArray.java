
public class SortBinaryArray {

	public static void sortBinaryArray(int[] arr) {
		// TODO Auto-generated method stub
		
		int i=0,j=arr.length-1;
		while(i<j)
		{
			if(arr[i]==0)
				i++;
			else if(arr[j]==1)
				j--;
			else
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
				
		}
	}

	public static void pushZerosAtEnd(int[] arr) {
		// TODO Auto-generated method stub
		
		int i=0,j=0;
		int[] temp=new int[arr.length];
		
		while(i<arr.length) {
			
			if(arr[i]==0)
				i++;
			else
			{
				temp[j]=arr[i];
				i++;j++;
			}
		}
		for(i=0;i<arr.length;i++)
			arr[i]=temp[i];
		
		
	}

}
