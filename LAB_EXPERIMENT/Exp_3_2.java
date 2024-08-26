class Exp_3_2
{
	
	public static void main(String []args)
	{
		int a[][] = {{1,2,3},{4,5,6}, {7,8,9}};
		int b[][] = {{1,2,3},{4,5,6}, {7,8,9}};
		
		int add[][] = new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				add[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("Addition of metrix is");
		
		for(int i=0;i<3;i++)
		{
			System.out.print("| ");
			for(int j=0;j<3;j++)
			{
				System.out.print(add[i][j]+" ");
			}
			System.out.print(" |\n");
		}
		
		int mul[][] = new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				int sum = 0;
				for(int k=0;k<3;k++)
				{
					sum += a[i][k] * b[k][j];
				}
				mul[i][j] = sum;
			}
		}
		
		System.out.println("Matrix multiplication is ");
		for(int i=0;i<3;i++)
		{
			System.out.print("| ");
			for(int j=0;j<3;j++)
			{
				System.out.print(mul[i][j]+" ");
			}
			System.out.print(" |\n");
		}
	}
}