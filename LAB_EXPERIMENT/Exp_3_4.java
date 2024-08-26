import java.util.Scanner;

class Exp_3_4
{
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string");
		String temp = input.nextLine();
		StringBuffer str = new StringBuffer(temp);
		int i=0;
		char ch;
		while(i<str.length())
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				ch = str.charAt(i);
				ch = (char)(ch - 32);
				str.setCharAt(i,ch);
			}
			i++;
		}
		
		System.out.println("New string is \n" + str);
	}
}