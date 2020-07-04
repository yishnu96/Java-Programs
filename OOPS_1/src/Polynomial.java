public class Polynomial {
	
	int coefficient[];
	int degree;
	
	public Polynomial() 
	{
		coefficient = new int[1];
		degree = 0;
	}
	
	
	public void setCoefficient(int degree, int coefficient)
	{
		if(degree >= this.coefficient.length) 
		{
			doubleSize(degree);
		}
		
		this.coefficient[degree] = coefficient;
		if(this.degree < degree)
			this.degree = degree;
	}
	
	public void doubleSize(int degree) 
	{
		int[] temp = coefficient;
		
		coefficient = new int[2*degree];
		for(int i = 0; i <= this.degree; i++)
			coefficient[i] = temp[i];
	}
	
	public int getCoefficient(int degree) 
	{
		
		if(degree > this.degree)
			return 0;
		
		return coefficient[degree];
		
	}
	
	public Polynomial add(Polynomial second) 
	{
		int largest = Math.max(degree, second.degree);
		
		Polynomial ans = new Polynomial();
		
		for(int i = 0; i <= largest; i++)
			ans.setCoefficient(i, this.getCoefficient(i) + second.getCoefficient(i));
		
		return ans;
	}
	
	public Polynomial subtract(Polynomial second) 
	{
		int largest = Math.max(degree, second.degree);
		Polynomial ans = new Polynomial();
		
		for(int i = 0; i <= largest; i++)
			ans.setCoefficient(i, this.getCoefficient(i) - second.getCoefficient(i));
		
		return ans;
	}
	
	public void print() 
	{
		for(int i = 0; i <= degree; i++)
			if(coefficient[i] != 0)
				System.out.print(coefficient[i]+"x"+i+" ");
	}
	
	public Polynomial multiply(Polynomial second) 
	{
		Polynomial temp = new Polynomial();
		
		for(int i = 0; i <= degree; i++) 
		{
			for(int j = 0; j <= second.degree;j++) 
			{
				temp.setCoefficient(i + j,  temp.getCoefficient(i+j) + this.getCoefficient(i) * second.getCoefficient(j));
			}
		}
		return temp;
	}

}
	

