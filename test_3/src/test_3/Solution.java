package test_3;

public class Solution {

	public static void leaders(int[] input) {
		
		int size = input.length,j;
		for (int i = size; i >=0; i--)  
        { 
            for (j = i + 1; j < size; j++)  
            { 
                if (input[i] <= input[j]) 
                    break; 
            } 
            if (j == size) 
                System.out.print(input[i] + " "); 
        } 
	}
	
	

	public static String minLengthWord(String str) {


		String word = "", mini = "";    
	    String[] words = new String[100]; 
		int length = 0;
		
		for(int i = 0; i < str.length(); i++){    
			
	          if(str.charAt(i) != ' '){    
	              word = word + str.charAt(i);    
	          }    
	          else{     
	              words[length] = word;    
	              length++;     
	              word = "";    
	          }    
	    }     

		System.out.println(words[2]);
		
	      mini= words[0];    
	           
	      for(int k = 0; k < length; k++){    
	          if(mini.length() > words[k].length())    
	              mini = words[k];    
	      } 
	      
		return mini;
	}

	
	public static long maximumSumPath(int[] input1, int[] input2) {

		int n1=input1.length,n2=input2.length;
		int i=0,j=0,total=0,firstSum=0,secondSum=0;
		
		while(i<n1 && j<n2)
		{
			if(input1[i] < input2[j])	//Array 1
				firstSum+=input1[i++];
			
			else if(input1[i] > input2[j])		//Array 2
				secondSum+=input2[j++];
			
			else {							//When Equal
				
				//total+=Math.max(firstSum, secondSum);
				if(firstSum> secondSum)
					total+=firstSum;
				else 
					total+=secondSum;
				
				firstSum=secondSum=0;
				
				while(i<n1 && j<n2 && input1[i]==input2[j])
				{
					total+=input1[i];
					i++;j++;
				}
			}
		}
		
		while (i<n1)				//Remaining
			firstSum+=input1[i++];
		
		while(j<n2)
			secondSum=input2[j++];
		
		total+=Math.max(firstSum, secondSum);
		
		return total;
	}



	public static long lnfact(int n) {
		
		if (n == 1) 
            return 0; 
        return (long) (lnfact(n - 1) + Math.log(n)); 
    }

}
