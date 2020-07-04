import java.util.Scanner;

public class excel_problem {

	private static void printString(int num) 
    { 
        StringBuilder columnName = new StringBuilder(); 
  
        while (num > 0) { 
            int rem = num % 26; 
  
            if (rem == 0) { 
                columnName.append("Z"); 
                num = (num / 26) - 1; 
            } 
            else 
            { 
                columnName.append((char)((rem - 1) + 'A')); 
                num = num / 26; 
            } 
        } 
  
        System.out.println(columnName.reverse()); 
    } 
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		printString(num);
	}
}
