import java.util.*;
public class Exp_2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n");
        int n = input.nextInt();
        System.out.println("Fibonacci number of "+n+"th element is ");
        int a = 0,b=1;
        int sum = 0;
        for(int i = 0;i<n-2;i++)
        {
            sum = a+b;
            a = b;
            b = sum;
        }

        System.out.println(sum);
    }
}
