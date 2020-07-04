package search;
import java.util.Scanner;

public class Main {
	static Scanner s1 = new Scanner(System.in);
		
	public static int[] takeInput() {
		System.out.println("Enter Size");
		int size = s1.nextInt();
		
		System.out.println("Enter Array : ");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s1.nextInt();
		}
		return arr;
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		//System.out.println("Enter Number : ");
		//int num = s1.nextInt();
		
		//System.out.print(BinarySearch.binarySearch(arr, num));
		
		//SelectionSort.selectionSort(arr);
		//BubbleSort.bubbleSort(arr);
		//InsertionSort.insertionSort(arr);
		//ArrayRotate.rotate(arr, num);
		//print(arr);									//Print
		
		//System.out.print(SecondLargest.secondLargestElement(arr));

		//int[] arr1 = takeInput();
		//int[] arr2 = takeInput();
		//int ans[] = MergeSort.merge(arr1, arr2);
		
		//print(SumOfTwoArrays.sumOfTwoArrays(arr1, arr2));
		
		Sort012.sort012(arr);
		print(arr);
		
	}
}