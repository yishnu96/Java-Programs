import java.io.*;
import java.util.*;

public class Cards {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		Deck d=new Deck();
		int x=s.nextInt();
		while(x!=-1)
		{
		    if(x==1)
		    {
		        int card=s.nextInt();
		        char suite=s.next().charAt(0);
		        d.remove(card,suite);
		    }
		    else 
		    {
		        int card=s.nextInt();
		        System.out.println(d.probability(card));
		    }
		    x=s.nextInt();
		}
	}
}

class Deck{
	
	private int[] a = {0,1,2,3,4,5,6,7,8,9,10,11,12};
	private int[] b = {0,1,2,3,4,5,6,7,8,9,10,11,12};
	private int[] c = {0,1,2,3,4,5,6,7,8,9,10,11,12};
	private int[] d = {0,1,2,3,4,5,6,7,8,9,10,11,12};
	private int size = 0;
	
	public void remove(int card, char suite) {
	
		if(suite == 'a')
		{
			a[card] = 0;
		}
		if(suite == 'b')
		{
			b[card] = 0;
		}
		if(suite == 'c')
		{
			c[card] = 0;
		}
		if(suite == 'd')
		{
			d[card] = 0;
		}
		size++;
	}

	public int probability(int card) {
		
		int num = 0;
		if(a[card] != 0)
			num++;
		if(a[card] != 0)
			num++;
		if(a[card] != 0)
			num++;
		if(a[card] != 0)
			num++;
		
		double prov = (1.0*num)/(52-size);
		return (int)(prov*1000);
	}
    
}
