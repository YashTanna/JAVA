class PassByValue
{    
	public static void main(String args[])
	{   int i=0;
		System.out.println("Before  Update the value is = " +i);
		update(i);
		System.out.println("After  Update the value is = " +i);
	}
	static void update(int i)
	{   i++; 
	}
}