public class Exp_2_3 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                for(int k=1;k<=4;k++)
                {
                    for(int a = 1;a<=4;a++)
                    {
                        if(i < j && a<k && i!=k && i!= a && a!=j && k!=j)
                        {
                            System.out.println(i + " " + j+ " "+ k + " "+ a + " ");
                        }
                    }
                }
            }
        }
    }
}
