import java.util.Scanner;
public class squr_root {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		if (x == 0 || x == 1) {
			System.out.println(x); 
			System.exit(0);
		}
            
  
        // Staring from 1, try all numbers until 
        // i*i is greater than or equal to x. 
        int i = 1, result = 1; 
          
        while (result <= x) { 
            i++; 
            result = i * i; 
        } 
        System.out.println(i-1);
	}

}
