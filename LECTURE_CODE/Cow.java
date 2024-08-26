
// import Animals.Animal;
import Animals.*;

class Cow implements Animal
{
	public void eat() {
      System.out.println("Cow eats");
   }

   public void travel() {
      System.out.println("Cow travels");
   } 

   public int noOfLegs() {
      return 4;
   }

   public static void main(String args[]) {
      Cow m = new Cow();
      m.eat();
      m.travel();
	  System.out.println("Cow has" + m.noOfLegs()+ "Legs");
   }
	
}