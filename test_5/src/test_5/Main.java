package test_5;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
//		int a;
//		Scanner s = new Scanner(System.in);
//		a = s.nextInt();
//		IncreasingNum.printIncreasingNumber(a);
		
		Scanner s = new Scanner(System.in);
        String charSet = s.next();
        int len = s.nextInt();
        String ans[] = Solution.allStrings(charSet, len);
        for(String str : ans){
            System.out.println(str);
        }
	}

}
