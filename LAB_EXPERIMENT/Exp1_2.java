//Print Fibonacci Series

import java.util.*;

class Exp1_2
{
	public static void main(String[] args)
	{
		System.out.println("Enter number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int a=0;
		int b=1;
		int sum = 0;
		System.out.print(a+"\t");
		System.out.print(b+"\t");
		for(int i=0;i<num-2;i++)
		{
			sum = a+b;
			a=b;
			b=sum;
			System.out.print(sum+"\t");
		}
	}
}