package search;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i = 0;i<arr.length-1;i++)
		{
			int min_idx = i; 
            for (int j = i+1; j < arr.length; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 

            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
		}
	}

}
