package Question;

public class PolynomialUse {

	public static void main(String[] args) {
		 
		Polynomial p = new Polynomial();
		
		Polynomial p1 = new Polynomial();
		p.setCoefficient(7, 2);
		p.setCoefficient(8, 3);
		p.setCoefficient(6, 5);
		p1.setCoefficient(7, 3);
		p1.setCoefficient(8, 4);
	
		Polynomial  result = p.add(p1);
		result.print();
		
		Polynomial result2 = p.subtract(p1);
			result2.print();

	}

}
