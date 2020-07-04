package asdfghn;
import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int number = in.nextInt();
		int i=2;
		boolean flag=true;
        while(i<number) {
        	if(number%i==0) {
        		flag = false;
        		System.out.print(i);
        	}
        	i++;
        }
        if(flag== true) {
        	System.out.print("All the factors of "+ number +" excluding 1 and the number itself");
        }
        
        
	}

}
