import java.util.Scanner;
public class Sequence_Of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		boolean flag = true; 
	      
	    // to store the prevoius digit 
	    int prev = -1;  
	      
	    // pointer to tell what type of sequence  
	    // are we dealing with 
	    int type = -1;  
	  
	    while(n != 0) 
	    { 
	        if(type ==-1) 
	        { 
	            if(prev ==-1) 
	            { 
	                prev = n % 10; 
	                n = n/10; 
	                continue; 
	            } 
	            // check if we have same digit  
	            // as the prevoius digit 
	            if(prev == n % 10)  
	            {  
	                flag = false; 
	                break; 
	            } 
	            // checking the peak point of the number 
	            if(prev > n % 10)  
	            {  
	                type = 1; 
	                prev = n % 10; 
	                n = n/10; 
	                continue; 
	            } 
	              
	            prev = n % 10; 
	            n = n / 10; 
	        }
	        else
	        {  
	            // check if we have same digit 
	            // as the prevoius digit 
	            if(prev == n % 10)  
	            {  
	                flag = false; 
	                break; 
	            } 
	            if(prev < n % 10)  
	            {          
	                flag = false; 
	                break; 
	            } 
	              
	            prev = n % 10; 
	            n = n / 10; 
	        } 
	    } 
	  
	    System.out.println(flag); 
	} 
}


