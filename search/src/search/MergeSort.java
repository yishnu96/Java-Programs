package search;

public class MergeSort {

	public static int[] merge(int[] arr1, int[] arr2) {
		
        int i = 0, j = 0,k=0; 
        int n1=arr1.length,n2=arr2.length;
        int[] resultarr = new int[n1+n2];
        
        while (i < n1 && j < n2) 
        { 
            if (arr1[i] <= arr2[j]) 
            { 
                resultarr[k] = arr1[i]; 
                i++; 
            } 
            else
            { 
                resultarr[k] = arr2[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) 
        { 
            resultarr[k] = arr1[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            resultarr[k] = arr2[j]; 
            j++; 
            k++; 
        } 
		return resultarr;
	}

}
