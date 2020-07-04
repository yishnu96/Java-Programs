import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class Intersection {

	public static void intersection(int[] arr1, int[] arr2) {
		
		HashMap<Integer, Integer> map =new HashMap<Integer, Integer>();
		for (int i = 0; i < arr1.length; i++) {
			if(map.containsKey(arr1[i]))
			{
				Integer value = map.get(arr1[i]);
				map.put(arr1[i], value+ 1);
			}
			else
				map.put(arr1[i], 1);
		}
		
		for (int i = 0; i < arr2.length; i++) {
			if(map.containsKey(arr2[i]))
			{
				Integer value = map.get(arr2[i]);
				if(value > 0)
				{
					System.out.println(arr2[i]);
					map.put(arr2[i], value-1);
				}
			}
		}
		
	}

	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {

//		First we are using the HashMap it has (key:value) pair
//      HashMap<key,value> name = new HashMap() 
        HashSet<Integer,Integer>map = new HashSet<E>();
//         Now we will put all the elements in our Hashmap from arr
        
        for(int val:arr){
            if(map.containsKey(val)){
                int count = map.get(val);
                map.put(val,count+1);
            }else{
                map.put(val,1);
            }
        }
        
//      Now we need an ArrayList
        ArrayList<Integer> output = new ArrayList();
        
//        for(int i=0;i<arr.length;i++)
//        {
//            ArrayList<Integer> temp = new ArrayList();
//            
//                    int val = arr[i];
//                    while(map.containsKey(val))
//                    {
//                        temp.add(val);
//                        val+=1;
//                    }
//            if(output.size() < temp.size()){
//                output = new ArrayList();
//                output.addAll(temp);
//            }
//                
//        }
        
        for( Entry<Integer, Integer> i:map.entrySet())
        {
        	Entry<Integer, Integer> val = i;
        	while(map.containsKey(val))
        	{
        		val=val+;
        		
        	}
        	
        }
        
        return output;

	}

}
