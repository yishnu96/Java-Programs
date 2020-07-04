import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Breath_first_Search {
	
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
		
//		 bfs(matrix);
	}

	private static void bfs(int[][] matrix) {
		
		Queue<Integer> remVertices = new LinkedList<Integer>();
		boolean[] visited = new boolean[matrix.length];
		visited[0] = true;
		remVertices.add(0);
		
		while(!remVertices.isEmpty())
		{
			int currVertices = remVertices.poll();
			System.out.print(currVertices+" ");
			
			for (int i = 0; i < matrix.length; i++) {
				if(matrix[currVertices][i] == 1 && !visited[i])
				{
					remVertices.add(i);
					visited[i] = true;
				}
			}
		}
	}

}
