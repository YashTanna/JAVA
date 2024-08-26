import java.util.*;

public class FindMaxinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter "+n+" number");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int max = 0;
        int min = 9999;
        for(int i=0;i<n;i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        System.out.println("Max element in array is "+max);
        System.out.println("Min element in array is "+min);
    }
}
