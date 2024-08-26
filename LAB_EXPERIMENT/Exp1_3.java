//Find the sum of digits of a number

import java.util.*;

class Exp1_3
{
	public static void main(String[] args)
	{
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = num;
		int sum = 0;
		for(int i=0;num2!=0;i++)
		{
			sum += num2%10;
			num2 = num2 /10;
		}
		System.out.println("Sum of digits of number is : "+sum);
	}
}