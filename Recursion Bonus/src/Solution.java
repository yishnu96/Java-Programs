
public class Solution {

	public static int reverseInteger(int num) {
		if(num > 0)
            return  reversDigits(num);
        else{
            num=num*-1;
            System.out.println(num);
            return  reversDigits(num)*-1;
        }
	}
    
   static int reversDigits(int num) 
    { 
        int rev_num = 0; 
        while(num > 0) 
        { 
            rev_num = rev_num * 10 + num % 10; 
            num = num / 10; 
        } 
        return rev_num; 
    } 
}