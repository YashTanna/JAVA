import java.awt.*;
import java.awt.event.*;

public class s_2_3_1 extends Frame implements ActionListener{

    TextField t1,t2;

    s_2_3_1()
    {
        setSize(500,500);
        setVisible(true);

        setLayout(new GridLayout(2,0));

        t1 = new TextField();
        t2 = new TextField();

        add(t1);
        add(t2);

        t1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s1 = t1.getText();
        t2.setText(s1.toUpperCase());
        t1.setText("");
    }


    public static void main(String[] args) {
        s_2_3_1 s = new s_2_3_1();
    }
}
