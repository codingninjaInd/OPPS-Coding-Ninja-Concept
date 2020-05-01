package Question;
import  java.util.ArrayList;

public class DyanamicArrayUse {

	public static void main(String[] args) {
		
		DyanamicArray d = new DyanamicArray();
		
		for(int i=1;i<100;i++)
		{
			d.add(100+i);
		}
		
		System.out.println(d.size());
		System.out.println(d.get(6));
		
	}
}
	


