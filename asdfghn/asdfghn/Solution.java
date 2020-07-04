package asdfghn;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		int start ;
		int end;
		int step ;
		
	    Scanner in = new Scanner(System.in);

	    start = in.nextInt();
	    end = in.nextInt();
	    step = in.nextInt();
	    
	    while(start <= end) {	 
	    	//int cel = ((start - 32)*5)/9;
	    	System.out.println(start+" "+ ((start - 32)*5)/9);
	    	start = start + step;
	    }

	}
}
