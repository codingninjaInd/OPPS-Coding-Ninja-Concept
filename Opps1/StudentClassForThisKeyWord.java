package Opps1;

public class StudentClassForThisKeyWord {

	String name ;
	private int roll;
	
	public void set(int roll)
	{
		if(roll<=0)
		{
			return;
		}
		this.roll = roll;
	}
	public int get()
	{
		return roll;
	}

}
