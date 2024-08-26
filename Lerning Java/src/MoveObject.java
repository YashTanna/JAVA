import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MoveObject extends Frame implements Runnable {
    String str = "Yash";
    int x = 0;
    public void run()
    {
        while(true)
        {
            while(x <= 500)
            {
                try{Thread.sleep(50);}catch(Exception c){}
                x += 5;
                repaint();
            }
            while(x>=0)
            {
                try{Thread.sleep(50);}catch(Exception c){}
                x -= 5;
                repaint();
            }
        }
    }

    MoveObject()
    {
        setSize(500,500);
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
    public void paint(Graphics g)
    {
        g.drawString(str,x,100);
    }


    public static void main(String[] args) {
        MoveObject m = new MoveObject();
        Thread t = new Thread(m);
        t.start();
    }
}
