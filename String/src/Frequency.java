
public class Frequency {

	public static char highestOccuringCharacter(String inputString) {
		
        int count[] = new int[256]; 
       
        int len = inputString.length(); 
        for (int i=0; i<len; i++) 
            count[inputString.charAt(i)]++; 
       
        int max = -1;   char result = ' ';   
       
        for (int i = 0; i < len; i++) { 
            if (max < count[inputString.charAt(i)]) { 
                max = count[inputString.charAt(i)]; 
                result = inputString.charAt(i); 
            } 
        } 
        return result; 
	}

	public static String compress(String inputString) {
	       
        int len = inputString.length(); 
        String str=new String();
        String str2=new String();
        int i=0,count =1;
        while(i<len-1)
        {
        	while(inputString.charAt(i)==inputString.charAt(i+1) && i<len)
        	{
        		count++;
        		i++;
        	}
        	str = str + inputString.charAt(i)+count;
        	i++;count=1;
        }
        
        for(i=0;i<str.length();i++)
        {
        	if(str.charAt(i)=='1')
        		continue;
        	else
        		str2 =str2 +str.charAt(i);
        }
        str2=str2+inputString.charAt(len-1);
        
        return str2;
	}

	public static String removeConsecutiveDuplicates(String inputString) {
		
		int count[] = new int[256]; 
	    String result=new String();
        int len = inputString.length(); 
        for (int i=0; i<len; i++) 
            count[inputString.charAt(i)]++; 
       
       
        for (int i = 0; i < len-1; i++) 
        { 
        	if(inputString.charAt(i)==inputString.charAt(i+1) && inputString.charAt(i)!='\0')
        		continue;
        	else if (0 < count[inputString.charAt(i)]) 
                result = result+inputString.charAt(i); 
        } 

        result = result+inputString.charAt(len-1); 
        return result; 
	}

}
