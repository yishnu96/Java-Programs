/*Sample Input 2 :
5
Sample Output 2 :
*****
 *****
  *****
   *****
    *****
    */

import java.util.Scanner;
public class rombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new	Scanner(System.in);
		int rows =in.nextInt();
		
		int i, j; 
	    for (i=1; i<=rows; i++) 
	    { 
	        // Print trailing spaces 
	        for (j=1; j<= i; j++) 
	            System.out.print(" "); 
	              
	        // Print stars after spaces 
	        for (j=1; j<=rows; j++) 
	        	System.out.print("*"); 
	              
	        System.out.println();
	    } 
	}

}
