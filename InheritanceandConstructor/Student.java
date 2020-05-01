package InheritanceandConstructor;

public class Student extends College {
	
	int rollNo;
	public Student()
	{
		super(101);// passing therte value to college constractor
		System.out.println("Student constractor is calling");
		
		
	}

}
