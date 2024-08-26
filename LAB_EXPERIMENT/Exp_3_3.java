import java.util.*;

class Exp_3_3
{
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		String str;
		System.out.println("Enter String");
		str = input.nextLine();
		int pos = str.indexOf('@');
		String strmail = str.substring(0,pos);
		String strdomain = str.substring((pos+1),(str.length()));
		
		System.out.println(strmail);
		System.out.println(strdomain);
	}
}