package Question;

public class CompexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumbers c1 = new ComplexNumbers(4,5);
		c1.print();
		ComplexNumbers c2 = new ComplexNumbers(6,7);
		c2.print();
		c1.multiply(c2);
		c1.print();
		
		

	}

}
