import java.awt.*;
import java.awt.event.*;

public class item_Event extends Frame implements ItemListener{
    public static void main(String[] args) {
        item_Event i = new item_Event();
    }

    Checkbox c1;
    Checkbox c2;
    Checkbox c3;
    Canvas c;

    item_Event()
    {
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(700,700);
        c1 = new Checkbox("RED");
        c2 = new Checkbox("GREEN");
        c3 = new Checkbox("BLUE");
        c = new Canvas();
        c.setBackground(Color.black);
        c.setSize(200,200);
        c.setVisible(true);
        add(c);
        add(c1);
        add(c2);
        add(c3);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        int r = c1.getState()?255:0;
        int g = c2.getState()?255:0;
        int b = c3.getState()?255:0;

        Color co = new Color(r,g,b);
        c.setBackground(co);
    }
}
