import java.util.*;
class ParameterizedConstructor
{
	ParameterizedConstructor(int num1, int num2)
	{
		int result= num1+num2;
		System.out.println("Sum of num1 and num2 is=" +result);
	}
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		int No1 = input.nextInt();
		System.out.println("Enter second number");
		int No2 = input.nextInt();
		ParameterizedConstructor ob1 = new ParameterizedConstructor (No1,No2);
	}
	
}