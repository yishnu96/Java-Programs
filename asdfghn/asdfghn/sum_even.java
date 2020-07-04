package asdfghn;
import java.util.Scanner;
public class sum_even {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n,sum_e=0,sum_o=0;
	    n = in.nextInt();
	    while(n>0){
	    	int digit = n % 10;
	    	n= n/ 10;
	    	int rem = digit % 2;
	    	if(rem != 0)
	               sum_o+=digit;
	    	else
	               sum_e+=digit;
	    }
	    System.out.print(sum_e+" "+sum_o);
	}

}
