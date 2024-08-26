import java.awt.*;
import java.awt.Graphics;

class frame3 extends Frame
{
    frame3(){
        Frame f1 = new Frame("Frame class");
        f1.setVisible(true);
        f1.setSize(600,400);
        f1.setBackground(Color.RED);
    }
    public void paint()
    {
        
    }

}
class MyFrame2
{
    public static void main(String[] args) {
        frame3 f2 = new frame3();
    }
}