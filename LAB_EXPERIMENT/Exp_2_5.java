import java.util.*;

public class Exp_2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to find Factorial");
        int n = input.nextInt();
        int fact = 1;
        for(int i=n;i>0;i--)
        {
            fact *= i;
        }

        System.out.println("Factorial of "+n+" is "+fact);
    }
}
