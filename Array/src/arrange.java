import java.util.Scanner;
public class arrange {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int arr[]=new int[n];
		int count=1;
		for(int i=0;i<n/2;i++)
		{
			arr[i]=count;
			count++;
			
			arr[n-i-1]=count;
			count++;
		}
		if(n%2!=0)
			arr[n/2]=n;
		
		for(int i = 0;i<n;i++)
			System.out.print(arr[i] + " ");
		
	}

}
