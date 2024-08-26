import java.awt.*;

public class TextField_Class extends Frame {

    TextField_Class()
    {
        setLayout(null);
        setVisible(true);
        setSize(500,500);
        Label l1 = new Label("TextField");
        TextField t1 = new TextField();

        l1.setBounds(50,100,100,50);
        t1.setBounds(150,120,200,20);

        add(l1,BorderLayout.CENTER);
        add(t1,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        TextField_Class t1 = new TextField_Class();
    }
}
