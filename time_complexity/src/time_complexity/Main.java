package time_complexity;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	/*public static void print(ArrayList<Integer> list) {
		for (int i : list) {
			System.out.print(i+" ");
		}
	}*/
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		//int[] arr2 = takeInput();
		System.out.println("Answer ...\n");
		//Intersection.intersection(arr1, arr2);
		//System.out.print(ArrayEquilibrium.arrayEquilibrium(arr1));
		//System.out.print(FindUnique.findUnique(arr1));
		//System.out.print(DuplicateInArray.duplicate(arr1));
		
		int num = s.nextInt();
		PairSum.pairSum(arr1, num);
	}
}