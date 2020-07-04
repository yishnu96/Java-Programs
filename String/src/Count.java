
public class Count {

	public static int countWords(String str) {
		// TODO Auto-generated method stub
		
		char[] copy=new char[str.length()];
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			copy[i]=str.charAt(i);
			if(((i>0)&&(copy[i]==' ')&&(copy[i+1]!=' '))||((copy[0]!=' ')&&(i==0)))
				count++;
		}
		
		return count;
	}

	public static void printSubstrings(String str) {
		// TODO Auto-generated method stub
		for(int i=0;i<str.length();i++)
		{
			for(int j = i+1;j<str.length()+1;j++)
			{
				System.out.println(str.substring(i, j));
			}
		}
	}
}
