import java.util.*;

public class Exp_3_1 {
    public static void main(String[] args) {
        System.out.println("Enter number element for first array");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int []a1 = new int[n];
        System.out.println("Enter "+n+" number");
        int a2[] = {7,9,3,1,10};
        int [] a = new int[10];
        for(int i=0;i<a1.length;i++)
        {
            a[i] = a1[i];
        }
        int j=0;
        for(int i=a1.length;i<a2.length+a1.length;i++)
        {
            a[i] = a2[j++];
        }
        int len = a.length - 1;
        int temp = 0;
        for(int i=0;i<a.length-1;i++)
        {
            for(j=i+1;j<=a.length-1;j++)
            {
                if(a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}
