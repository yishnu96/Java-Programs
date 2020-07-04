import java.util.Scanner;
public class intersection {

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput(){
		
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter First Array :");
		int[] input1 = takeInput();
		System.out.println("Enter Second Array :");
		int[] input2 = takeInput();
		
		System.out.println();
		System.out.println("Soln");
		
		for(int i=0;i<input1.length;i++)
		{
			for(int j=0;j<input2.length;j++)
			{
				if(input1[i]==input2[j])
					System.out.println(input1[i]);
					input2[j]= Integer.MIN_VALUE;
					break;
			}
		}
	}

}
