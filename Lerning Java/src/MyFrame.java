import java.awt.*;
import java.awt.Graphics.*;

public class MyFrame extends Frame {
    public MyFrame()
    {
        setVisible(true);
        setSize(600,400);
//        setBackground(Color.RED);
        setTitle("MyFrame");
    }
    public void paint(Graphics g)
    {
        g.drawString("Hello",50,50);
        g.drawRect(275,175,50,50);
//        g.drawArc(50,50,100,100);
    
    }

    public static void main(String[] args) {
        MyFrame f1 = new MyFrame();
    }
}
