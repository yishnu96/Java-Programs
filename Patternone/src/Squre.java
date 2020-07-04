import java.util.Scanner;
public class Squre {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int alphabet = 65;
		int c=0;
		int n = in.nextInt();
		for (int i = 0; i <= n; i++)
        {	c=i;
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (c+ alphabet) );
                alphabet++;
            }
            System.out.println();
        }
	}
}
