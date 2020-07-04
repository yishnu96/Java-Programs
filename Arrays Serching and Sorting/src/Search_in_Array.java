
public class Search_in_Array {

	public static int search(int[] arr, int num) {
		int n=0;
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) 
			if(arr[i]==num) {
				n=i;
				flag=true;
			}
		
		if(flag)
			return n;
		else
			return -1;
	}

}
