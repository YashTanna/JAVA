import java.awt.*;

public class CardLayout_Class extends Frame {

    CardLayout_Class()
    {
        setVisible(true);
        setSize(500,500);
        CardLayout c1 = new CardLayout();
        Panel p1 = new Panel();
        p1.add(new Button("Submit"));
        p1.add(new Button("CAncel"));

        Panel p2 = new Panel();
        p2.add(new Button("Show"));
        p2.add(new Button("Cancel"));

        add(p1,"Card1");
        add(p2,"Card2");

        c1.show(this,"Card2");

    }

    public static void main(String[] args) {
        CardLayout_Class c = new CardLayout_Class();
    }
}
