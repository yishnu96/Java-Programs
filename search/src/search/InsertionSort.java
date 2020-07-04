package search;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		int i, element, j;  
	    for (i = 1; i < arr.length; i++) 
	    {  
	        element = arr[i];  
	        j = i - 1;  
	        while (j >= 0 && arr[j] > element) 
	        {  
	            arr[j + 1] = arr[j];  
	            j = j - 1;  
	        }  
	        arr[j + 1] = element;  
	    }  
	}

}
