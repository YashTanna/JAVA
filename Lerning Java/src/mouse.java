import java.awt.*;
import java.awt.event.*;

class mouse extends Frame
{
    int x = 0,y = 0;
    mouse()
    {
        setSize(500,500);
        setVisible(true);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillOval(x,y,50,50);
    }


    public static void main(String[] args) {
        mouse m = new mouse();
    }
}