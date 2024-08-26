import java.awt.*;

class label_class extends Frame
{

    label_class()
    {
        setLayout(null);
        setVisible(true);
        setSize(500,500);
        Label l1 = new Label("User Name");
        l1.setBounds(50,50,100,50);
        add(l1);

        Label l2 = new Label("Password");
        l2.setBounds(50,150,100,50);
        add(l2);

    }

    public static void main(String[] args) {
        label_class l1 = new label_class();
    }
}