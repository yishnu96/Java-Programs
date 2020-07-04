import java.util.Scanner;
public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		/*int n=in.nextInt();
		
		int j;
		for(int i = n+1;i>1;i--)
		{
			
			for(j=1;j<=n;j++)
			{
				//if(j>=i)
			//		System.out.print("*");
			//	else
					System.out.print(j);
			}
			for(j=n;j>0;j--)
			{
			//	if(j>=i)
				//	System.out.print("*");
			//	else
					System.out.print(j);
			}
			System.out.println();
		}*/
		
		 int n=in.nextInt();
		 int number=n;
		 int result,max=0,rem;
		 
		 	n=n/10;
		 	result=n;
		 	if(result>max)
		 		max=result;
		 	
		 	n=number;
		 	rem=n%10;
		 	n=n/100;
		 	result=n*10+rem;
		 	if(result>max)
		 		max=result;
		 	
		 	n=number;
		 	rem=n%100;
		 	n=n/1000;
		 	result=n*100+rem;
		 	if(result>max)
		 		max=result;
		 	
		 	n=number;
		 	n=n%1000;
		 	result=n;
		 	if(result>max)
		 		max=result;
		 	
		 	System.out.println(max);
		 	
	}

}
