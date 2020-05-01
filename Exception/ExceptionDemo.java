package Exception;

public class ExceptionDemo {
	
	
	public static int fact(int no)
	{
		int n
	}
	
	public static int divide(int a ,int b) throws ZeroExption
	{
		if(b==0)
			throw new ZeroExption(); // throw keyword is used to rase exception
		
		return a / b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		String s = null;
//		System.out.println(s.length()); // this will throw a string out of bond exception
		
//		System.out.println(4/0);  // this will throw a ArithmeticException 
//		
		//thre are three deffrent types of exception
		//1 errors - these are extream cases cause is case of hard disk failiar
		//2.Unchecked Exception-
		//3.cyhecked exception
		try {
			divide(10,5);
		} catch (ZeroExption e) {  // it will exiute when exception arriges
			
			System.out.println("You have divide no by Zero");
			
			//e.printStackTrace();
		}
		finally       /// this block will always exicute wether exceotin erries or not
		{
			System.out.println("My name is pushpendra singh");
		}
		System.out.println("main");

	}

}
