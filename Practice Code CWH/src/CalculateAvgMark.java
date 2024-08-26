import java.util.*;

public class CalculateAvgMark {
    public static void main(String[] args) {
        System.out.println("How many student are there in class room");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] marks = new int[n];
        System.out.println("Enter mark of physics of "+n+" students");
        for(int i=0;i<n;i++)
        {
            marks[i] = sc.nextInt();
        }
        int sum = 0;
        for(int number:marks)
        {
            sum += number;
        }
        float avg = sum / (float)n;
        System.out.println("Average mark of physics is :"+avg);
    }
}
