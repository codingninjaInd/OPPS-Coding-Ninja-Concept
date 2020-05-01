package Opps1;

public class Student {

	String name ;
	private int roll;
	
	public void set(int num)
	{
		if(num<=0)
		{
			return;
		}
		roll = num;
	}
	public int get()
	{
		return roll;
	}
}
