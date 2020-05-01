package Question;

public class DyanamicArray {
	
	private int data[];
	private int nextElementIndex;
	public  DyanamicArray()
	{
		data = new int[5];
		nextElementIndex =0;
	}
	
	public int size()   //for returnning the current size of an array
	{
		return nextElementIndex;
	}
	
	public boolean isEmpty()   //for checking array is empty or not
	{
		return nextElementIndex == 0;
	}
	
	public int get(int i)
	{
		if(i>=nextElementIndex)
		{
			// throw an error
			return -1;
		}
	
		return data[i];
	}
	// Now we will make a functin for incerting the element
	
	public void add(int elem)
	{
		if(nextElementIndex== data.length)
		{
			doubleCapacity();
		}
		data[nextElementIndex] = elem;
		
		nextElementIndex++;
	}

	private void doubleCapacity() {
		 int temp[] = data;          // coping the address of data into temp
		 data = new int[2*temp.length];   // doblling the size of data array
		for(int i=0;i<temp.length;i++)
		{
			data[i] = temp[i];       //copying the privipous element into new data type array
		}
		
	}
}
