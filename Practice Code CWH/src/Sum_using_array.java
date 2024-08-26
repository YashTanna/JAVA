import java.util.*;

public class Sum_using_array {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        float [] num = new float[n];
        System.out.println("Enter "+n+" float numbers");
        for(int i=0;i<n;i++)
        {
            num[i] = sc.nextFloat();
        }
        float sum = 0;
        for(int i=0;i<n;i++)
        {
            sum += num[i];
        }
        System.out.println("Sum of number you entered is :"+sum);

    }
}
