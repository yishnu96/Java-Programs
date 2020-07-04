import java.util.Arrays;

public class Solution {
	/*public static int sum(int[] input){
		
		int n=input.length;
		int sum=0;
		for(int i = 0;i<n;i++)
		{
			sum=sum + input[i];
		}
		return sum;

	}
*/
	/*public static void swapAlternate(int[] input) {
		// TODO Auto-generated method stub
		int n=input.length;
		if(n/2!=0)
			n=n-1;
		for(int i=0;i<n;i+=2)
		{
			int temp=input[i];
			input[i]=input[i+1];
			input[i+1]=temp;
		}
		
	}
	*/

	public static int findUnique(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			boolean unique=false;
			
			for(int j = 0;j<arr.length;j++)
			{
				if(i!=j && arr[i]==arr[j]) {
					unique=true;
					break;
				}
			}
			if(!unique)
				return arr[i];
		}
		return 0;
	}

}
