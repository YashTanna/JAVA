import java.util.*;

class Exp_1_1_3
{
	public static void main(String[] args)
	{
		System.out.println("Enter number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=num-i;k>0;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}