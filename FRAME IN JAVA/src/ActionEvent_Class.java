import java.awt.event.*;
import java.awt.*;


public class ActionEvent_Class extends Frame implements ActionListener{

    int count = 0;
    ActionEvent_Class()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        Button b = new Button("Change");
        add(b);
        b.addActionListener(this);
    }


    public static void main(String[] args) {
        ActionEvent_Class a = new ActionEvent_Class();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(count == 0)
        {
            setBackground(Color.PINK);
            count = 1;
        }
        else if (count == 1)
        {
            setBackground(Color.black);
            count = 2;
        }
        else if(count == 3)
        {
            setBackground(Color.BLUE);
        }


    }
}
