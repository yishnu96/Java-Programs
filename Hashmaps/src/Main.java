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

	public static void print(ArrayList<Integer> list) {
		for (int i : list) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
//		int[] arr = takeInput();
//		int[] arr2 = takeInput();
//		
//		Intersection.intersection(arr1, arr2);
		
//		String uniChars = Hash.uniqueChar(s.next());
//		System.out.println(uniChars);
//		int n = s.nextInt();
//		Hash.PairSum(arr1, n);
		
//		ArrayList<Integer> ans = Intersection.longestConsecutiveIncreasingSequence(arr);
//		for(int num: ans) 
//			System.out.println(num);
		
//		ArrayList<Integer> arr = new ArrayList<>();
//
//		int size = s.nextInt();
//		for(int i = 0; i < size; i++)
//			arr.add(s.nextInt());
//
//		System.out.println(Hash.lengthOfLongestSubsetWithZeroSum(arr));
//		s.close();
		
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		ArrayList<Integer> ans = Intersection.longestConsecutiveIncreasingSequence(arr);
		for(int num: ans) {
			System.out.println(num);
		}
		
	}
}