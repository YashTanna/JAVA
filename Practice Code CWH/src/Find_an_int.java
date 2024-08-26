import java.util.*;

public class Find_an_int {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] num = new int[n];
        System.out.println("Enter "+n+" number");
        for(int i=0;i<n;i++)
        {
            num[i]= sc.nextInt();
        }
        System.out.println("Enter number which you want to find");
        int find = sc.nextInt();
        boolean result = false;
        for(int i=0;i<n;i++)
        {
            if(num[i]==find)
            {
                result = true;
                break;
            }
        }
        if(result==true)
        {
            System.out.println("Number is present");
        }
        else
        {
            System.out.println("Number is not present");
        }
    }
}
