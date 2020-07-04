package test_5;

public class IncreasingNum {

	public static void printIncreasingNumber(int a) {
		printIncreasingNumber(1,"",a);
	}
	
	static void printIncreasingNumber(int index, String out, int n) 
    { 
        if (n == 0) 
        { 
            System.out.print(out + " "); 
            return; 
        } 
        for (int i = index; i <= 9; i++) 
        { 
            String str = out + Integer.toString(i); 
   
            printIncreasingNumber(i + 1, str, n - 1); 
        } 
    } 

}
