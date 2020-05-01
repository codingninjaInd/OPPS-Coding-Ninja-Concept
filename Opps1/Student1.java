package Opps1;

public class Student1 {

	 String name;
	int rollNO;
	public  void print()
	{
		System.out.println(name+" "+rollNO);
	}
	public Student1(String s ,int n)   //making constructor with two argument
	{
		name = s;
		rollNO = n;
	}
	public Student1(String s)    //making constructor with one arhument,
	{
		name = s;
		//rollNO = n;
	}
	
}
