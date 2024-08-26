import java.awt.*;
import java.awt.event.*;

public class Exp_7_1 {
    private Frame f = new Frame("Calculator");
    private TextField n1 = new TextField(10), n2 = new TextField(10), r = new TextField(10);
    private Button a = new Button("Add"), s = new Button("Sub"), m = new Button("Mul"), d = new Button("Div");

    public Exp_7_1() {
        f.setLayout(new GridLayout(4, 2));
        f.add(new Label("Number 1: ")); f.add(n1);
        f.add(new Label("Number 2: ")); f.add(n2);
        f.add(new Label("Result: ")); f.add(r);
        f.add(a); f.add(s); f.add(m); f.add(d);

        a.addActionListener(e -> calc('+'));
        s.addActionListener(e -> calc('-'));
        m.addActionListener(e -> calc('*'));
        d.addActionListener(e -> calc('/'));

        f.setSize(300, 200);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
    }

    private void calc(char o) {
        try {
            double x = Double.parseDouble(n1.getText()), y = Double.parseDouble(n2.getText()), z = 0;
            switch (o) {case '+': z = x + y; break; case '-': z = x - y; break; case '*': z = x * y; break;
                case '/': z = y != 0 ? x / y : Double.POSITIVE_INFINITY;}
            r.setText(Double.isInfinite(z) ? "Error: Division by zero" : String.valueOf(z));
        } catch (NumberFormatException e) {r.setText("Invalid input");}
    }

    public static void main(String[] args) {new Exp_7_1();}
}
