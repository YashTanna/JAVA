public class Additionof2DArray {
    public static void main(String[] args) {
        int [][] array1 = {{15,56,54},{63,28,98}};
        int [][] array2 = {{56,28,92},{69,83,75}};
        int [][] sum = new int[2][3];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println("Sum is ");
        for (int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
