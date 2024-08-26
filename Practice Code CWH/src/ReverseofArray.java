import java.util.*;

public class ReverseofArray {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter n number");
        int [] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int temp = 0;
        int len = n-1;
        for(int i=0;i<n/2;i++)
        {
            temp = a[i];
            a[i] = a[len];
            a[len--] = temp;
        }
        System.out.println("Reverse of array is :");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}
