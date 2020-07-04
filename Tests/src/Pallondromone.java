import java.util.Scanner;
public class Pallondromone {
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int r,sum=0,temp; 
		  
		  temp=n;    
		  while(n>0)
		  {    
		   r=n%10; 
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("true");    
		  else    
		   System.out.println("false");
	}
}
