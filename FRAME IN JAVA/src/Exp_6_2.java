import java.awt.*;
import java.awt.Graphics.*;

class MyFrame extends Frame
{
    int x = 80;
    int y = 120;
    int mul = 1;
    MyFrame()
    {
        setTitle("Multiplication Table");
        setVisible(true);
        setSize(700,500);
    }
    public void paint(Graphics g)
    {
        //Horizontal Line
        g.drawLine(70,100,300,100);
        //Vertical Line
        g.drawLine(100,70,100,300);
        for(int i=0;i<10;i++)
        {
            g.drawString((i+1)+"",x,y + (i*20));
        }
        x = 110;
        y = 90;
        for(int i=0;i<10;i++)
        {
            g.drawString((i+1)+"",x + (20*i),y);
        }
        x = 90;
        y = 100;
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++)
            {
                mul = i*j;
                g.drawString(mul+"",x+(20*j),y+(20*i));
            }
        }
    }
}

public class Exp_6_2 {
    public static void main(String[] args) {
        MyFrame f1 = new MyFrame();
    }
}
