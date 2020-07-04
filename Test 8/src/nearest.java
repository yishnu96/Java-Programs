import java.util.HashMap;
import java.util.Scanner;

import javax.naming.ldap.HasControls;

public class nearest{
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
		}
		
		System.out.println(minDistance(arr));
		
	
	}

	private static int minDistance(int[] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i]))
			{
				Integer val = map.get(arr[i]);
				map.put(arr[i], val + 1);
			}
			else
				map.put(arr[i], 1);
		}
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i]))
			{
				Integer val = map.get(arr[i]);
				if(val == 2)
				{
					num = arr[i];
					break;
				}
			}
		}
//		System.out.println(num);
		
		int min_indx = 0,max_indx = 0,i;
		for ( i = 0; i < arr.length; i++) {
			if(arr[i] == num);
			{
				min_indx = i;
				break;
			}
		}
		for (int j = i+1; j < arr.length; j++) {
			if(arr[j] == num)
			{
				max_indx = j;
				break;
			}
		}
		
		return max_indx - min_indx;
	}


}

