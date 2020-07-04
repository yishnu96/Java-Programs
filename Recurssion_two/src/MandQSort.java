
public class MandQSort {

	public static void meSort(int[] input, int first, int last) {
		if (first < last) 
        { 
            int m = (first+last)/2; 
  
            meSort(input, first, m); 
            meSort(input , m+1, last); 
  
            merge(input, first, m, last); 
        } 
	}

	private static void merge(int[] arr, int l, int m, int r) {
		
		int n1 = m - l + 1; 
        int n2 = r - m; 
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        int i = 0, j = 0; 
  
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
		
	}

	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		if (disks == 1) 
        { 
            System.out.println(source + " " + destination); 
            return; 
        } 
        towerOfHanoi(disks-1, source,destination, auxiliary);
        System.out.println(source + " " + destination); 
        towerOfHanoi(disks-1, auxiliary,source, destination);
		
	}

}
