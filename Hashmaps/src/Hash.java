import java.util.ArrayList;

import java.util.HashMap;

public class Hash {

	public static int maxFrequencyNumber(int[] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> frequency = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(map.containsKey(arr[i]))
			{
				Integer value = map.get(arr[i]);
				map.put(arr[i], value+1);
			}
			else
			{
				map.put(arr[i], 1);
				frequency.add(arr[i]);
			}
		}
		
		int k=0,max=0,value=0;
		for( Integer i : frequency)
		{
			k = map.get(i);
//			System.out.println(k);
			if(k>max) {
				max = k;
				value =i;
			}
			
		}
		
		return value ;
	}

	public static String uniqueChar(String str) {
				
		HashMap<Character, Integer> map =new HashMap<Character, Integer>();
		String ans = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			if(map.containsKey(str.charAt(i)))
				continue;
			
			else 
			{
				map.put(str.charAt(i), 1);
				ans = ans + str.charAt(i);
			}
		}
		
		return ans;
	}

	public static void PairSum(int[] arr, int n) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(map.containsKey(arr[i]))
			{
				Integer value = map.get(arr[i]);
				map.put(arr[i], value+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i]*-1))
			{
				Integer v = map.get(arr[i]*-1);
				if(v>0)
				{
					if (arr[i] > 0)
						 System.out.println(arr[i]*-1+" "+arr[i]);
					else
						 System.out.println(arr[i]+" "+arr[i]*1);;
					map.put(arr[i]*-1, v-1);
					map.put(arr[i], v-1);
				}
			}
		}
	}

	public static int lengthOfLongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		int max = 0; 

		for (int i = 0; i < arr.size(); i++) 
		{ 
			int curr = 0; 

			for (int j = i; j < arr.size(); j++)
			{ 
				curr += arr.get(j); 

				if (curr == 0)
					max = Math.max(max, j - i + 1); 
			}
		}
		return max; 
	}

}
