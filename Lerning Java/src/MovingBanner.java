import java.awt.*;
import java.awt.event.*;

public class MovingBanner extends Frame implements Runnable {


    int x = 0,flag = 0;

    public void run()
    {
        while(true)
        {
        repaint();
        try{

            Thread.sleep(10);

        }
        catch(Exception c)
        {

        }}
    }
    MovingBanner() {
        setSize(500, 500);
        setVisible(true);
        setLayout(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }
    public void paint(Graphics g)
    {
        x = x + 10 * flag;
        if (x > 500) {
            flag = -1;

        }
        if (x < 20) {
            flag = 1;

        }
        g.drawString("Yash", x,50);

    }
    public static void main(String[] args) {
        MovingBanner m = new MovingBanner();
        Thread t = new Thread(m);
        t.start();
    }
}
