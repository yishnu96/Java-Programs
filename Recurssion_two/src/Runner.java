import java.util.Scanner;

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput() {
		
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		//int[] input = takeInput();
		//MandQSort.meSort(input,0,input.length-1);
		//printArray(input);
		//int n=s.nextInt();
		
		String str = s.next();
		//char c1 = s.next().charAt(0);
		//char c2 = s.next().charAt(0);
		//System.out.println(Sentence.replaceCharacter(input, c1, c2));
		//System.out.println(Sentence.removeConsecutiveDuplicates(str));
		//System.out.println(Sentence.removeX(str));
		//System.out.println(Sentence.addStars(str));
		//System.out.println(Sentence.replace(str));
		//MandQSort.towerOfHanoi(n, 'a', 'b', 'c');
		System.out.println(Sentence.convertStringToInt(str));
	}
}
