class ThisPointer
{   int i=10;
    ThisPointer(int i)
	{
		
	 System.out.println("Before assigning value=" +this.i);
	 this.i=i;
	 System.out.println("After assigning the value"+this.i);
	}
	public static void main(String args[])
	{
		ThisPointer ob1= new ThisPointer(20);
	}
}