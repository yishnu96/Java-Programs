
public class Gather_Rain_Water {

	public static int water(int[] arr) {
		
		int[] left =new int[arr.length];
		int[] right = new int[arr.length];
		int water_reserve=0;
		
		left[0]=arr[0];
		for (int i = 1; i < left.length; i++) {
			left[i]=Math.max(left[i-1], arr[i]);
		}
		
		right[right.length-1] = arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
			right[i]=Math.max(right[i+1], arr[i]);
		
		for(int i=0;i<arr.length;i++)
			water_reserve+=Math.min(left[i], right[i]) - arr[i];
		
		return water_reserve;
	}

	

}
