import java.awt.*;
import java.awt.Graphics.*;

public class font_class extends Frame{

    font_class()
    {
        setVisible(true);
        setSize(700,500);
        setTitle("Font Class");
        Color c1 = new Color(0x009270);
        setBackground(c1);
    }

    public void paint(Graphics g)
    {
        Font f1 = new Font("Consolas",2    ,100);
        g.setFont(f1);
        g.setColor(Color.WHITE);
        g.drawString("Yash Tanna",50,100);
    }

    public static void main(String[] args) {
        font_class f1 = new font_class();
    }
}
