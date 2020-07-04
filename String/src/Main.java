import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//String input1 = s.next();
		//String input2 = s.next();
		
		String input = s.nextLine();
		//char c = s.next().charAt(0);
		
		//System.out.println(solution.isPermutation(input1, input2));
		
		//System.out.println(Frequency.highestOccuringCharacter(input1));
		
		System.out.println(Frequency.compress(input));
		
		//System.out.println(solution.removeAllOccurrencesOfChar(input, c));
		//System.out.println(Frequency.removeConsecutiveDuplicates(input1));
		
	}
}
