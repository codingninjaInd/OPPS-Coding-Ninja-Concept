package Question;

public class ComplexNumbers {
	
	int real;
	int imegnary;
	
	public  ComplexNumbers(int real,int imegnary)   // constrector for complexNo
	{
		this.real = real;
		this.imegnary = imegnary;
	}
	
	public void print()   // function for printing complex no
	{                       
		System.out.println(real+"+"+"i"+imegnary);
	}
	public void plus(ComplexNumbers c2)  // function for addind complex no
	{
		this.real = this.real+c2.real;
		this.imegnary = this.imegnary+c2.imegnary;
		
	}
	
	
	public void multiply(ComplexNumbers s)
	{
		int n = this.real;
		this.real = (this.real*s.real)-(this.imegnary*s.imegnary);
		this.imegnary = (this.imegnary*s.real)+(n*s.imegnary);
	}
	
	
	

}
