import java.awt.*;
import java.awt.event.*;

public class EXP_9 extends Frame implements ActionListener{

    int a[] = new int[5];

    Button b1;
    int x;
    TextField t1,t2;
    EXP_9()
    {
        for(int i=0;i<5;i++)
            a[i] = 10*i;
        setSize(400,500);
        setVisible(true);

        setLayout(new FlowLayout());

        b1 = new Button("Show");

        t1 = new TextField(45);
        t2 = new TextField(45);

        add(t1);
        add(t2);
        add(b1);

        b1.addActionListener(this);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e)
    {
//        String str = t1.getText();

        try
        {
            t2.setText(String.valueOf(a[Integer.parseInt(t1.getText())]));
            t1.setText("");
        }
        catch(Exception d)
        {

            t2.setText(d.getMessage());
            t1.setText("");
        }
    }


    public static void main(String[] args) {
        EXP_9 e =  new EXP_9();
    }
}
