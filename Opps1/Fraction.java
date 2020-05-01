package Opps1;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator,int  denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
		simplyfy();
	}

	private void simplyfy() {
		int gcd =1;
		int smaller = Math.min(numerator, denominator);  //finding the smallest bbitween numerator and denominatior for itrating the till then
		for(int i =2;i<=smaller;i++ )
		{
			if(numerator%i==0 && denominator%i==0)
			{
				gcd = i;  // finding gretest common divisor
				
			}
		}
		
		numerator = numerator/gcd;
		 denominator =  denominator/gcd;
		
	}
	
	public  void increment()  // making function for incrtementing 1
	{
		numerator = numerator+ denominator;
		simplyfy();
	}
	
	public void print()   // for printing the fracton;
	{
		System.out.println(numerator+ "/"+denominator);
	}
	
	public void add(Fraction f2)   /// making function for adding two fraction
	{
		//first fraction is fraction on which function is called
		//secend fraction is fractiom that is used as argument
		
		this.numerator = this.numerator*f2.denominator+this.denominator*f2.numerator;
		this.denominator = this.denominator*f2.denominator;
		simplyfy();
	}

	
}
