package Animals;
/* File name : Dog.java */

public class Dog implements Animal {

   public void eat() {
      System.out.println("Dog eats");
   }

   public void travel() {
      System.out.println("Dog travels");
   } 

   public int noOfLegs() {
      return 4;
   }

   public static void main(String args[]) {
      Dog m = new Dog();
      m.eat();
      m.travel();
	  System.out.println("Dog has" + m.noOfLegs()+ "Legs");
   }
} 