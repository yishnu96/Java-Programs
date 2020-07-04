import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number Of Elements: ");
		int n=in.nextInt();
		
		System.out.println("EnterArray: ");
		int[] arr=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		
//		System.out.println("EnterNumberTo serch");
//		int serch=in.nextInt();
		
//		System.out.println(Gather_Rain_Water.water(arr));
//		System.out.println(Search_in_Array.search(arr,serch));
		
//		System.out.println(Transition_Point(arr));
		System.out.println(Pain_Sum_Check(arr,in.nextInt()));
	}

	private static boolean Pain_Sum_Check(int[] arr,int x) {
		
		int i,n=arr.length; 
		
	    for (i=0; i<n-1; i++) {
	        if (arr[i] > arr[i+1]) 
	            break; 
	    }
	    
	    int l = (i+1)%n; 
	    int r = i;      
	    while (l != r) 
	    { 
	         if (arr[l] + arr[r] == x) 
	              return true; 
	  
	         if (arr[l] + arr[r] < x) 
	              l = (l + 1)%n; 
	         
	         else  
	              r = (n + r - 1)%n; 
	    } 
	    return false; 
	}

	private static int Transition_Point(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == 1)
			{
				return i;
			}
		}
		return -1;
			
	}
}
