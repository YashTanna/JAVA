import java.awt.*;
import java.awt.Graphics;

public class graphics_class extends Frame{

    graphics_class()
    {
        setVisible(true);
        setSize(500,500);
        setBackground(Color.yellow);
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillRect(50,50,100,70);
        g.drawRect(50,150,100,70);
    }

    public static void main(String[] args) {
        graphics_class g1 = new graphics_class();
    }
}
