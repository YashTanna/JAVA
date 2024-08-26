class Car   //Parent class
{
  String Color;
  int speed;
 String setColor(String Color)
  {
	  this.Color = Color;
	  return Color;
  }
 int setSpeed(int speed)
  {
	  this.speed = speed;
	  return speed;
  }
}
class nano extends ParentClass    //Child class
{
	Car c1 = new Car();
	Engine e1 = new Engine();
  void setComponent()
  {
	  System.out.println("Car color will be" +c1.setColor("RED"));
	  System.out.println("Car Speed will be" +c1.setSpeed(150));
	  System.out.println("Engine capacity will be" +e1.EngineCapacity(2000));
  }

}
class Engine   //Helper class
{   int capactiy;
	int EngineCapacity(int capactiy)
	{
		this.capactiy = capactiy;
		return capactiy;
	}
}
class HasARelationship
{
  public static void main(String args[])
  {
	  nano n1 = new nano();
	  n1.setComponent();
  }

}
