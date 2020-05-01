package ExceptionTwo;

import java.util.Scanner;

public class ExceptionUse {
	
	public static int fact(int n) throws bondException
	{
		if(n <=1)
			throw new bondException();
		int ans =1;
		
		for(int i=2;i<=n;i++)
		{
			ans *= i;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	try {                             //handling exception
		System.out.println(fact(n));
	
	} catch (bondException e) {
		// TODO Auto-generated catch block
		System.out.println("Sahi se no dal be");
		//e.printStackTrace();
	}
	
	
	

	}

}
