package search;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int i, j, temp; 
        for (i = 0; i < arr.length - 1; i++)  
        { 
            for (j = 0; j < arr.length - i - 1; j++)  
            { 
                if (arr[j] > arr[j + 1])  
                { 
                    temp = arr[j]; 		// swap 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
            } 
        } 
	}

}
