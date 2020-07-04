import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public interface jumping_number {

	public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        printJumpingNumbers(n);

	}

	public static void printJumpingNumbers(int n) {
		
//		System.out.print("0");
		for (int i = 0;  i<n; i++) {
			if(checkjumpnum(i))
			{
				System.out.print(i+" ");
			}
		}
		
	}

	public static boolean checkjumpnum(int num) {
		
		boolean status = true;
        while(num != 0){
            int d1 = num % 10;
            num /= 10;
            if(num != 0){
                int d2 = num % 10;
                if(Math.abs(d1 - d2) != 1){
                    status = false;
                    break;
                }
            }
        }
        if(status)
            return true;
        else
        	return false;
	}

	
}
