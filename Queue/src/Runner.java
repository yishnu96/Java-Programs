import java.util.*;

public class Runner{
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		Queue<Integer> q =new LinkedList<Integer>();
		for(int i = 0; i < n; i++){
			q.add(s.nextInt());
		}
		int k = s.nextInt();
		Queue<Integer> ans = Reverse.reverseKElements(q,k);
		while(!ans.isEmpty()){
			System.out.println(ans.remove()+" ");
		}
	}
}