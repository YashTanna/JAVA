class A
{   
   void show()
   {
	   System.out.println("Method of A class called");
   }
}
class B extends A
{
	void show()
	{   super.show();
		System.out.println("Method of B class called");
	}
	
}
class SuperKeywordWithMethod
{
  public static void main(String args[])
  {
	    B b = new B();
		b.show();
  }

}