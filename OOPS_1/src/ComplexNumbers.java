
public class ComplexNumbers {

	int real, imaginary;
	public ComplexNumbers(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}


	public void plus(ComplexNumbers num) {
		
		this.real = this.real + num.real;
		this.imaginary = this.imaginary + num.imaginary;
		
	}

	public void multiply(ComplexNumbers num) {
		int n = this.real * num.real - this.imaginary* num.imaginary;
		this.imaginary = this.real * num.imaginary + this.imaginary*num.real;
		this.real=n;
		
	}

	public void print() {
		
		System.out.println(this.real + " + i"+this.imaginary);
		
	}

}
