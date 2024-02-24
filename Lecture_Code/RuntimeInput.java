import java.util.*;
class RuntimeInput
{
  public static void main(String args[])
  {
    String name;
    int age;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name");
    name= input.next();
    System.out.println("Enter your age");
    age= input.nextInt();
    System.out.println("Entered Name=" +name);
    System.out.println("Entered Age=" +age);
   }
}