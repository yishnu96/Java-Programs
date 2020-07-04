package asdfghn;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		double totalSalary;
		
		int basic = in.nextInt();
		char grad = in.next().charAt(0);
		
		double da = 0.50*basic;
		double pf = 0.11*basic;
		double hra =0.20*basic;
		
		if(grad == 'A')
		{
			totalSalary= basic + hra + da + 1700 -pf;
			System.out.print(Math.round(totalSalary));
		}
		else if(grad == 'B')
		{
			totalSalary= basic + hra + da + 1500 -pf;
			System.out.print(Math.round(totalSalary));
		}
		else
		{
			totalSalary= basic + hra + da + 1300 -pf;
			System.out.print(Math.round(totalSalary));
		}
	}
}
