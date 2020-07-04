import java.util.Scanner;

public class largest_palindrom {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		String str = s.next();
		int k = s.nextInt();
		
		System.out.println(largest_palindrom_fun(str,k));
	}

	private static String largest_palindrom_fun(String str, int k) {
		
		char palin[] = str.toCharArray(); 
        String ans = ""; 
        int l = 0; 
        int r = str.length() - 1; 
  
        while (l < r) 
        { 
            if (str.charAt(l) != str.charAt(r)) 
            { 
                palin[l] = palin[r] = (char) Math.max(str.charAt(l), 
                                          str.charAt(r)); 
                k--; 
            } 
            l++; 
            r--; 
        } 
  
        if (k < 0) 
            return "Not possible"; 

        l = 0; 
        r = str.length() - 1; 
        while (l <= r)
        { 
            if (l == r) 
            { 
                if (k > 0) 
                    palin[l] = '9'; 
            } 
  
            if (palin[l] < '9') { 
                if (k >= 2 && palin[l] == str.charAt(l) && palin[r] == str.charAt(r)) 
                { 
                    k -= 2; 
                    palin[l] = palin[r] = '9'; 
                }
               else if (k >= 1 && (palin[l] != str.charAt(l) || palin[r] != str.charAt(r))) { 
                    k--; 
                    palin[l] = palin[r] = '9'; 
                } 
            } 
            l++; 
            r--; 
        } 
        for(int i = 0;i<palin.length;i++) 
            ans+=palin[i]; 
        return ans; 
	}
}
