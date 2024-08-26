import java.awt.*;
import java.awt.event.*;

public class mouse2 extends Frame {

    int x=0,y=0;
    mouse2()
    {
        setSize(500,500);
        setVisible(true);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    public void paint(Graphics g)
    {
        String str = "( "+x+" , "+y+" )";
        g.drawString(str,x,y);
    }

    public static void main(String[] args) {
        mouse2 m = new mouse2();
    }
}
