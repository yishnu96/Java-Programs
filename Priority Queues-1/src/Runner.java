import java.util.Scanner;

public class Runner {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {			//1 3 1 4 1 63 1 21 1 9 6 2 3 1 7 6 2 3 2 -1
		PriorityQueue pq = new PriorityQueue();
		int choice = s.nextInt();
		while(choice != -1) {
			switch(choice) {
				case 1 : // insert
					int element = s.nextInt();
					pq.insert(element);
					break;
				case 2 : // getMax
					System.out.println(pq.getMax());
					break;
				case 3 : // removeMax
					System.out.println(pq.removeMax());
					break;
				case 4 : // size
					System.out.println(pq.getSize());
					break;
				case 5 : // isEmpty
					System.out.println(pq.isEmpty());
					break;
				case 6 : 
					System.out.println("//Print");
					pq.print();
					System.out.println("=========");
					break;
					
					
				default :
						return;
			}
			choice = s.nextInt();
		}
	}

}