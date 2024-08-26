class HierarchicalInheritance
{
   public static void main(String args[])
 {
	 A a = new A();
	 a.show();
	 B b = new B();
	 b.display();
	 C c = new C();
	 c.print();
	 D d = new D();
	 d.showD();
 } 
}
class A
{
	void show()
	{
		System.out.println("Mehod of A class");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("Mehod of B class");
	}
}
class C extends A
{
	void print()
	{
		System.out.println("Mehod of C class");
	}
}
class D extends A
{
   void showD()
   {
         System.out.println("Mehod of D class");
   }
}