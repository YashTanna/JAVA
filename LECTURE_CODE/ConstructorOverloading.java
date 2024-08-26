import java.util.*;
class ConstructorOverloading
{
	ConstructorOverloading()
	{
		System.out.println("Default constructor has no arguments");
	}
	ConstructorOverloading(int num1, int num2)
	{
		int result= num1+num2;
		System.out.println("Sum of num1 and num2 is=" +result);
	}
	public static void main(String args[])
	{
		ConstructorOverloading ob1 = new ConstructorOverloading();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int No1 = input.nextInt();
		System.out.println("Enter second number");
		int No2 = input.nextInt();
		ConstructorOverloading ob2 = new ConstructorOverloading (No1,No2);
	}
	
}