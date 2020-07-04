import java.util.Arrays;
import java.util.Scanner;

public class Gather_rain_water {
	public static void main(String[] args) {			//	 90 100 20 80 50 
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Number of array");
		int size = s.nextInt();
		int[] elevation = new int[size];
		int[] copy = new int[size];
		
		System.out.println("Enter Array");
		for (int i = 0; i < size; i++) 
			elevation[i] = s.nextInt();
		
		copy = elevation;
		
		Arrays.sort(copy);
		int highest_piller = copy[size - 1];
		System.out.println(highest_piller);
		int second_highest = copy[size - 2];
		System.out.println(second_highest);
		int i = 0,sum=0;
		
		while(true) {
			if(elevation[i] == highest_piller )
				break;
			if( elevation[i] == second_highest)
				break;
			else
				i++;
		}
		
		System.out.println(i);
//		
//		while(elevation[i] != highest_piller || elevation[i] != second_highest || i<size)
//		{
//			sum = sum + (elevation[i] - second_highest);
//			i++;
//		}
//		
//		System.out.println(sum);
	}
}
