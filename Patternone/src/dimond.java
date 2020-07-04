import java.util.Scanner;
public class dimond {
	public static void main(String[] args) {
		int n, j;
		System.out.print("Enter the number of rows: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		int upper = n/2 + 1; //number of rows
        int i = 1;
        while(i<=upper){
            int space = 1;
            while(space<=upper-i){
                System.out.print(' ');
                space++;
            }
            int star = 1;
            while(star<=(2*i-1)){
                System.out.print('*');
                star++;
            }
            System.out.println();
            i++;
        }
        //printing the lower triangle
        int lower = n/2;
        i = 1;
        while(i<=lower){
            int space = 1;
            while(space<=i){
                System.out.print(' ');
                space++;
            }
            int star = 1;
            while(star<=2*(lower-i)+1){
                System.out.print('*');
                star++;
            }
            System.out.println();
            i++;
		}
	}

}
