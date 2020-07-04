package search;

public class ArrayRotate {

	public static void rotate(int[] arr, int num) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
			if(arr[i]==num)
				num=i;
		
		int[] temp =new int[arr.length];
		int j=0;
		for(int i=num;i<arr.length;i++)
		{
			temp[j]=arr[i];
			j++;
		}
		for(int i = 0;i<num;i++)
		{
			temp[j]=arr[i];
			j++;
		}
		for(int i = 0;i<arr.length;i++)
			arr[i]=temp[i];
	}

}
