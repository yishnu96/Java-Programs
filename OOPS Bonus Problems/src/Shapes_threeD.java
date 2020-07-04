import java.io.*;
import java.util.*;
class Shapes{
    int lsa;
    int tsa;
    int volume;
    final double PI=22/7;
    void print()
    {
        System.out.print(lsa+" "+tsa+" "+volume);
    }
}


class sphere extends Shapes{

	public sphere(int r) {
		lateralSurfaceArea(r);
		surfacearea(r);
		volume(r);
	}

	private void lateralSurfaceArea(int r) {
		super.lsa = (int) (4*super.PI*r*r);
		
	}

	private void volume(int r) {
		
		super.volume = (int) (super.PI*r*r*r);
		
	}

	private void surfacearea(int r) {
		super.tsa=(int) (4*super.PI*r*r);
	}
    
}


class cylinder extends Shapes{

	public cylinder(int r, int h) {
		lateralSurfaceArea(r,h);
		surfaceArea(r,h);
		volume(r,h);
	}

	private void volume(int r, int h) {
		super.volume = (int) (2*super.PI*r*r*h*0.3333333333333333333333333333333333);
	}

	private void surfaceArea(int r, int h) {
		super.tsa = (int) (2*PI*r*r + 2*r*h*PI);
	}

	private void lateralSurfaceArea(int r, int h) {
		super.lsa = (int) (2*PI*r*h);
		
	}
    
}
class cube extends Shapes{

	public cube(int r) {
		lateralSurfaceArea(r);
		surfaceArea(r);
		volume(r);
	}

	private void volume(int r) {
		super.volume = r*r*r;
	}

	private void surfaceArea(int r) {
		super.tsa=6*r*r;
	}

	private void lateralSurfaceArea(int r) {
		super.lsa=4*r*r;
	}
    
}
public class Shapes_threeD {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		    if(x==1)
		    {
		        int r=s.nextInt();
		        sphere sp=new sphere(r);
		        sp.print();
		        
		    }
		    else if(x==2) 
		    {
		        int r=s.nextInt();
		        int h=s.nextInt();
		        cylinder c=new cylinder(r,h);
		        c.print();
		    }
		    else
		    {
		        int r=s.nextInt();
		        cube c=new cube(r);
		        c.print();
		    }
		
	}
}