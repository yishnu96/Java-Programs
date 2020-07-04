package search;

public class Sort012 {

	public static void sort012(int[] arr) {
		
	    int i, cnt0 = 0, cnt1 = 0, cnt2 = 0,n=arr.length; 
	    
	    for (i = 0; i < n; i++) { 
	        switch (arr[i]) { 
	        case 0: 
	            cnt0++; 
	            break; 
	        case 1: 
	            cnt1++; 
	            break; 
	        case 2: 
	            cnt2++; 
	            break; 
	        } 
	    } 
	  
	    i = 0; 
	  
	    while (cnt0 > 0) { 
	        arr[i++] = 0; 
	        cnt0--; 
	    } 
	  
	    while (cnt1 > 0) { 
	        arr[i++] = 1; 
	        cnt1--; 
	    } 
	    
	    while (cnt2 > 0) { 
	        arr[i++] = 2; 
	        cnt2--; 
	    } 
	}

}
