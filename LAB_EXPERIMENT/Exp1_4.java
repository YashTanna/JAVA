//To reverse number

import java.util.*;

class Exp1_4
{
	public static void main(String[] args)
	{
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = num;
		int rnum = 0;
		for(int i=0;num2!=0;i++)
		{
			rnum = 10*rnum + (num2 % 10);
			num2 = num2 /10;
		}
		System.out.println("Reverse of number is : "+rnum);
	}
}