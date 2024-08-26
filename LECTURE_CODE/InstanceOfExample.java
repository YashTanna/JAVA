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
class InstanceOfExample
{
	public static void main(String args[])
	{
		ParentClass p1 = new ParentClass();
		ParentClass p2 = new ChildClass();
		ChildClass c1 = new ChildClass();
		ChildClass c2 = (ChildClass) p2 ;
		
		if( p2 instanceof ChildClass)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("NO");
		}
		
		
	}
	
	
}