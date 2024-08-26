import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;

public class ItemEvent_CheckboxGroup extends Frame implements ItemListener{
    public static void main(String[] args) {
        ItemEvent_CheckboxGroup i = new ItemEvent_CheckboxGroup();
    }

    CheckboxGroup cbg;
    Checkbox c1;
    Checkbox c2;
    int rs = 0;
    ItemEvent_CheckboxGroup()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        cbg = new CheckboxGroup();
        c1 = new Checkbox("React",cbg,false);
        c2 = new Checkbox("Circle",cbg,false);
        add(c1);
        add(c2);

        c1.addItemListener(this);
        c2.addItemListener(this);
    }

    public void paint(Graphics g)
    {
        if(rs == 1)
        {
            g.drawRect(50,50,100,100);
        }
        else if(rs == 2)
        {
            g.drawOval(50,50,100,100);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == c1)
        {
           rs = 1;
           repaint();
        }
        else if(e.getSource() == c2)
        {
            rs = 2;
            repaint();
        }
    }
}
