package time_complexity;

public class ArrayEquilibrium {

	public static int arrayEquilibrium(int[] arr) {

		int SumL =arr[0] ,SumR =0;
		
		for(int i=2;i<arr.length;i++)
			SumR = SumR + arr[i];
		
		
		int i = 1;
		while(i  < arr.length-1)
		{
			System.out.println(i +" "+ SumL + " "+SumR);
			if(SumL == SumR)
				return i;
			
			else
			{
				SumL+=arr[i];
				SumR -= arr[i+1];
				i++;
			}
		}
		return 0;
	}

}
