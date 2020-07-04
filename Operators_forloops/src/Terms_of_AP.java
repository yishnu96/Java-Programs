import java.util.Scanner;
public class Terms_of_AP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n =in.nextInt();
		
		int i=1,c=0;
		do {
			if((3*i+2)%4==0)
				i++;
			else {
				System.out.print(3*i+2 + " ");
				c++; i++;
			}
		}while(c<n);
	}

}
