import java.util.Arrays;

public class Pair {
	public static void pairSum(int[] input, int x) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<input.length;i++)
		{
			for(int j = i+1;j<input.length-1;j++)
			{
				if(i!=j && input[i]+input[j]==x)
					System.out.println(input[i] + " "+ input[j]);
			}
		}
	}

	public static void tripletSum(int[] input, int x) {
		// TODO Auto-generated method stub
		Arrays.sort(input);
		for(int i=0;i<input.length;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				for(int k=j+1;k<input.length;k++)
				{
					if(input[i]+input[j]+input[k] == x)
						System.out.println(input[i] + " "+input[j]+ " "+input[k]);
				}
			}
		}
	}
}
