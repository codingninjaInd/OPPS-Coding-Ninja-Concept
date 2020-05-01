package Opps1;

public class GetAndSetRoll {

	public static void main(String[] args) {
		 Student s = new Student();
		 s.name = "Pushpendra";
		 s.set(10);  //calling function for setting the roll no;
		 System.out.println(s.name+" "+s.get()); //here we used s.get for returning the value of roll  no
	}

}
