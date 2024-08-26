import java.awt.*;

class MyFrame extends Frame{
    MyFrame(){
        super("First Frame");
        setSize(500,500);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.drawString("YASH TANNA",50,50);
        g.setColor(Color.RED);
        g.drawRect(100,100,50,50);
        g.setColor(Color.BLUE);
        g.drawLine(100,100,150,150);
//        g.setColor(Color.CYAN);
        g.drawLine(150,100,100,150);


    }
}

public class Main{
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
    }
}