interface A
{
	final int a=10;
	public void show();
}
interface B
{
	final int b=20;
	public void display();
}
class C implements A,B     //Multiple inheritance using interface
{
	public void show()
	{
		System.out.println("Value of variable a=" +a);
	}
	public void display()
	{
		System.out.println("Value of variable b=" +b);
	}
}
class MultipleInheritance
{
	public static void main(String args[])
	{
	C c1= new C();
	c1.show();
	c1.display();
	}
}