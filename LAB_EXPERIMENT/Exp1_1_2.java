class Exp1_1_2
{
	public static void main(String[] args)
	{
		for(int i=0;i<4;i++)
		{
			for(int j=3-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<3;i++)
		{
			for(int j=1;j<i+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=3-i;k>0;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}