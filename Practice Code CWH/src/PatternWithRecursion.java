public class PatternWithRecursion {
    static int pattern(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        return pattern(n-1);
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
