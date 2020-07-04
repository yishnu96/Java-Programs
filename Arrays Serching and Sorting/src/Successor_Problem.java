import java.util.Arrays;
import java.util.Scanner;

public class Successor_Problem {
	
	public static void nextPermutation(int[] nums) {
		
	    int mark = -1;
	    for (int i = nums.length - 1; i > 0; i--) {
	        if (nums[i] > nums[i - 1]) {
	            mark = i - 1;
	            break;
	        }
	    }
	 
	    if (mark == -1) {
	        reverse(nums, 0, nums.length - 1);
	        return;
	    }
	 
	    int idx = nums.length-1;
	    for (int i = nums.length-1; i >= mark+1; i--) {
	        if (nums[i] > nums[mark]) {
	            idx = i;
	            break;
	        }
	    }
	 
	    swap(nums, mark, idx);
	 
	    reverse(nums, mark + 1, nums.length - 1);
	}
	 
	private static void swap(int[] nums, int i, int j) {
		
	    int t = nums[i];
	    nums[i] = nums[j];
	    nums[j] = t;
	}
	 
	private static void reverse(int[] nums, int i, int j) {
		
	    while (i < j) {
	        swap(nums, i, j);
	        i++;
	        j--;
	    }
	}
	
	public static int[] convertInt2Array(int guess)  {
		String temp = Integer.toString(guess);
		String temp2;
		int temp3;
		int [] newGuess = new int[temp.length()];
		
		for(int i=0;i<=temp.length();i++) {
			
			if (i!=temp.length()) {
				temp2 = temp.substring(i, i+1);
			} else {
				temp2 = temp.substring(i);
			}
			temp3 =  Integer.parseInt(temp2);    
			newGuess[i] = temp3;
		}

		return newGuess;          
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter : ");
		int num = s.nextInt();
		
		int j = 0;
		int len = Integer.toString(num).length();
		int[] arr = new int[len];
		while(num!=0)
		{
			arr[len-j-1] = num%10;
			num=num /10;
			j++;
		}
		
		nextPermutation(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
