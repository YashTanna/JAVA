import java.awt.*;

public class TextArea_Class extends Frame {

    TextArea_Class()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(null);
        TextArea t1 = new TextArea(5,5);
        add(t1);
    }

    public static void main(String[] args) {
        TextArea_Class t = new TextArea_Class();
    }
}
