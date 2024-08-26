import java.awt.*;

public class Borderlayout_Class extends Frame {

    Borderlayout_Class()
    {
        setVisible(true);
        setSize(500,500);
        setBackground(new Color(0x009270));

        BorderLayout bl1 = new BorderLayout(30,30);
        setLayout(bl1);

        Button b1 = new Button("North");
        Button b2 = new Button("South");
        Button b3 = new Button("East");
        Button b4 = new Button("West");
        Button b5 = new Button("Center");

        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        Borderlayout_Class b1 = new Borderlayout_Class();
    }
}
