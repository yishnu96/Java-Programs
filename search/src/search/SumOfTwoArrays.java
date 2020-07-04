package search;

public class SumOfTwoArrays {

	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int i=arr1.length-1,j=arr2.length-1;
		int n,rim=0;
		if(arr1.length>arr2.length)
			n = arr1.length+1;
		else
			n = arr2.length +1;
		int[] temp=new int[n];
		int k=n-1;
		while(i>=0 && j>=0)
		{
			
			int result =arr1[i]+arr2[j]+rim;
			System.out.println(result+ " = " +arr1[i]+" "+arr2[j]+" "+rim);
			if(result>9)
			{
				temp[k]=result%10;
				rim = result/10;
			}
			else
			{
				temp[k]=result;
				rim=0;
			}
			k--;j--;i--;
		}
		while(i>=0)
		{
			int result =arr1[i]+rim;
			System.out.println(result+ " = " +arr1[i]+" "+rim);
			if(result>9)
			{
				temp[k]=result%10;
				rim = result/10;
			}
			else
			{
				temp[k]=result;
			}
			k--;i--;
		}
		while(j>=0)
		{
			int result =arr2[j]+rim;
			System.out.println(result+ " = " +arr2[j]+" "+rim);
			if(result>9)
			{
				temp[k]=result%10;
				rim = result/10;
			}
			else
			{
				temp[k]=result;
			}
			k--;j--;
		}
		temp[k]=rim;
		
		
		return temp;
	}

}

