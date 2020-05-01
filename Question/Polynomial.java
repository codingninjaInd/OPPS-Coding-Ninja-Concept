package Question;

public class Polynomial {
	
    int[] data;
	int maxindex;

	
	public Polynomial()
	{
		data = new int[5];
		maxindex = data.length;
	
		
	}
	
	private void doubleCapacity() {
		 int temp[] = data;          // coping the address of data into temp
		 data = new int[2*temp.length];   // doblling the size of data array
		for(int i=0;i<temp.length;i++)
		{
			data[i] = temp[i];       //copying the privipous element into new data type array
		}
		
		for(int i= temp.length;i<data.length;i++)
		{
			data[i] = 0;
		}
		maxindex= data.length;
		
	}
	public void setCoefficient(int degree, int coeff){

		if(degree>=maxindex)
		{
			doubleCapacity();
		}
		
		data[degree] = coeff;
		
		
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		
		for(int i=0;i<maxindex;i++)
		{
			if(data[i] != 0)
			{
				System.out.print(data[i]+"x"+i+" ");
			}
		}
		
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
		 Polynomial sum = new  Polynomial();
		 
		 for( int i=0; i < p.maxindex; i++) {
		       // if (p.data[i] != 0)
		           sum.setCoefficient(i, this.data[i]+p.data[i]);
		       
		    }
		 if(this.maxindex>p.maxindex)
		 {
			 for(int i=p.maxindex-1;i<this.maxindex;i++)
				 sum.setCoefficient(i, this.data[i]);
			 
		 }
		 
		 return sum;
		
	}
	
	//Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		Polynomial sum = new  Polynomial();

		
		 for (int i = 0 ; i < p.maxindex; i++) {
		        //if (p.data[i] != 0)
		           sum.setCoefficient(i, this.data[i]-p.data[i]);
		    }
		 if(this.maxindex>p.maxindex)
		 {
			 for(int i=p.maxindex-1;i<=this.maxindex;i++)
				 sum.setCoefficient(i, this.data[i]);
		 }
		 
		 return sum;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
//	public Polynomial multiply(Polynomial p){
		
	}

//}

	
		
		
		

