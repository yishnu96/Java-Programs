package two_dimentional_array;
import java.util.Scanner;


public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	
	public static int[][] takeInput2D(){
		
		System.out.println("Enter Row and Colom");
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		
		System.out.println("Enter Matrix \n");
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	public static void print(int[][] input) {
		
		System.out.println(" Final Matrix.............\n");
		for(int i = 0; i < input.length; i++){
			for(int j = 0; j < input[0].length; j++){
				System.out.print(input[i][j]+"\t");
			}
			System.out.println();
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
	
		//int input[][] = takeInput2D();
		int input[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		print(input);
		System.out.println("\n\n.......Solution......\n\n");
		
		//Largest.findLargest(input);
		//solution.spiralPrint(input);
		solution.wavePrint(input);
		
	}

}
