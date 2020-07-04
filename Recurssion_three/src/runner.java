import java.util.Scanner;

public class runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		
		//String output[] = Classwork.keypad(input);
		//Classwork.printKeypad(input);
		//System.out.println(StringSoln.checkAB(input));
		
		//for(int i = 0; i < output.length; i++) 
		//	System.out.println(output[i]);
		
		String output[] = StringSoln.permutationOfString(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
