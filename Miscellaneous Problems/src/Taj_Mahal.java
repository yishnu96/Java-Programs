import java.util.Arrays;
import java.util.Scanner;

public class Taj_Mahal {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter Number Of Window : ");
		int window = s.nextInt();
		
		int[] person = new int[window];
		for (int i = 0; i < window; i++) 
			person[i] = s.nextInt();	
		
		
		findWindow(person,0);
		
	}

	private static void findWindow(int[] person, int window) {
				
		if(person[window] == 0)
		{
			System.out.println(window+1);
			return;
		}
		
		if(person.length == 2)
			if(person[0]<=person[1])
				System.out.println("1");
			else
				System.out.println("2");
		
		
		
		
		window++;
		
		while(person[window] != 0)
		{
			for(int i=0; i<person.length; i++)
				person[i]= person[i] <=0 ?  0: person[i]-1;
			
			System.out.print("W="+window);
			System.out.println(" A="+Arrays.toString(person));
			
			if(person[window]==0)
			{
				System.out.println(window+1);
				return;
			}
			else if(window >= person.length)
				window=0;
			
			window++;
		}
		System.out.println(window+1);
	}


}














