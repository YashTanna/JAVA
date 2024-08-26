// class A implements Runnable
// {
//     public void run()
//     {
//         for(int i=0;i<5;i++)
//         {
//             System.out.println("HI");
//             try {
//                 Thread.sleep(50);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable
// {
//     public void run()
//     {
//         for(int i=0;i<5;i++)
//         {
//             System.out.println("HELLO");
//             try {
//                 Thread.sleep(50);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable a = () ->
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("HI");
                try{Thread.sleep(50);}catch(Exception e){}
            }
        };
        
        Runnable b = () -> {
            
    
        for(int i=0;i<5;i++)
        {
            System.out.println("HELLO");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }    
}
