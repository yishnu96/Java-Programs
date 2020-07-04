import java.util.*;
import java.io.*;

class Player{
    String p_name;
    int jnumber, t_runs, innings, notouts;
    int avg;
    // complete the functions below to print the output in desired format
    void set(String name,int number,int runs,int inn,int nos){
        
        p_name=name;
        jnumber=number;
        t_runs = runs;
        innings = inn;
        notouts = nos;
        findavg();
        
    }
    void findavg(){
        avg= (t_runs+notouts)/innings;
    }

    void print(){
    	
    	System.out.print(p_name+" "+jnumber+" "+t_runs+" ");
    	System.out.print(innings + " "+notouts+" "+avg);
    	System.out.println();
    }
    
    
}

public class Cricketer {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    String name=s.next();
		    int num=s.nextInt();
		    int runs=s.nextInt();
		    int inn=s.nextInt();
		    int nos=s.nextInt();
		    Player p=new Player();
		    p.set(name,num,runs,inn,nos);
		    p.print();
		}
	}
}
