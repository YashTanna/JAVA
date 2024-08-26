class A
{   A()
	{
		System.out.println("Default Constructor");
	}
	A(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
}
class B extends A
{
	B(int e, int f)
	{  // super();               //Multiple super is not allowed
	    super(23,45,67);        // It must be first statement
		System.out.println(e+f);
	}
	
}
class SuperKeywordWithConstructor
{
  public static void main(String args[])
  {
	    B b = new B(344,67);
  }

}