import java.util.*;

public class SumofNUsingRecursion {
    static int sum(int n)
    {
        if(n==1)
            return 1;
        else
            return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("Sum of "+n+" natural number is "+result);
    }
}
