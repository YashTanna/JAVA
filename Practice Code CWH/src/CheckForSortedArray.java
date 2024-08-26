import java.util.*;

public class CheckForSortedArray {
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
        boolean result = false;
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                result = true;
                break;
            }
        }
        if(result == true)
        {
            System.out.println("Array is not sorted");
        }
        else
        {
            System.out.println("Array is sorted");
        }
    }
}
