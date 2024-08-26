class A
{   
   int a = 10;
}
class B extends A
{
	int a = 20;
	void show()
	{
		System.out.println(a); //print child class variable value
		System.out.println(super.a); //print parent class variable value
	}
	
}
class SuperKeywordWithVariable
{
  public static void main(String args[])
  {
	    B b = new B();
		b.show();
  }

}