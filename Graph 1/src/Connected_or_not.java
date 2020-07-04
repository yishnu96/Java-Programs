import java.util.Scanner;

public class Connected_or_not {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

		int[][] matrix = new int[V][V];
		for (int i = 0; i < E; i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			matrix[v1][v2] = 1;
			matrix[v2][v1] = 1;
		}
		
		int targetvertex1 = s.nextInt();
		int targetvertex2 = s.nextInt();
		
		boolean[] visit = new boolean[matrix.length];
//		if(Connected(matrix, visit, targetvertex1,targetvertex2)) 
//			System.out.println("true");
//		else
//			System.out.println("false");
		
		Connected(matrix, visit, targetvertex1,targetvertex2);
	}

	private static boolean Connected(int[][] matrix, boolean[] visit, int targetvertex1, int targetvertex2) {

		visit[targetvertex1] = true;
		System.out.println(targetvertex1+" ");
		for (int i = 0; i < matrix.length; i++) {
			if(matrix[targetvertex1][i] == 1 && visit[i] == false)
				Connected(matrix, visit, i, targetvertex2);
			else if(visit[targetvertex2])
				return true;
		}
		
		return false;
	}

	



}
