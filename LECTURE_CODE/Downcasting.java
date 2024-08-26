class ParentClass
{  
    int id;
	void show()
	{
		System.out.println("Method of parent class");
	}

}

class ChildClass extends ParentClass
{
	String name;
	void show()
	{
		System.out.println("Method of child class");
	}

}
class Downcasting
{
	public static void main(String args[])
	{
		ParentClass p = new ChildClass();    //First Perform Upcasting
		ChildClass c = (ChildClass) p;      // then only downcasting is applicable
		c.show();
		c.id= 10;
		c.name = "Fatema";
		System.out.println(c.id);
		System.out.println(c.name);
		
		
	}
	
	
}