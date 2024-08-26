import java.util.*;

public class RPC_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        Random ran = new Random(3);
        int random;

        for(int i=0;i<3;i++)
        {
            System.out.println("Press 1 for Rock");
            System.out.println("Press 2 for Paper");
            System.out.println("Press 3 for Secior");
            input= sc.nextInt();
            random = ran.nextInt();
            if(random==1)
            {
                System.out.println("Rock");
            }
            else if(random==2)
            {
                System.out.println("Paper");
            }
            else
            {
                System.out.println("Secior");
            }
            if(input == 1 && random == 2)
            {
                System.out.println("Computer Win!");
            }
            else if(input == 2&& random ==2)
            {
                System.out.println("Tie!");
            }else if(input == 3&& random ==2)
            {
                System.out.println("You Win!");
            }else if(input == 1&& random ==1)
            {
                System.out.println("Tie");
            }else if(input == 2&& random ==1)
            {
                System.out.println("You Win!");
            }else if(input == 3&& random ==1)
            {
                System.out.println("Computer Win!");
            }else if(input == 1&& random ==3)
            {
                System.out.println("You Win!");
            }else if(input == 2&& random ==3)
            {
                System.out.println("Computer!");
            }else if(input == 3&& random ==3)
            {
                System.out.println("Tie!");
            }
        }
    }
}
