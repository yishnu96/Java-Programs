import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num = s.nextInt();

		System.out.println(Solution.reverseInteger(num));
	}
}