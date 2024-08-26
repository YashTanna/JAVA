import java.awt.*;
import java.awt.event.*;

public class Exp_8_2 {
    private Frame frame = new Frame("Calculator");
    private TextField display = new TextField(20);
    private double num1, num2, result;
    private char operator;

    public Exp_8_2() {
        frame.setLayout(new BorderLayout());
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        Panel buttonPanel = new Panel(new GridLayout(4, 4));

        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);


        frame.pack();
        frame.setVisible(true);
    }

    class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String label = ((Button) e.getSource()).getLabel();

            if (Character.isDigit(label.charAt(0))) {
                display.setText(display.getText() + label);
            } else if (label.equals("C")) {
                display.setText("");
                num1 = num2 = result = 0;
                operator = '\0';
            } else if (label.equals("=")) {
                num2 = Double.parseDouble(display.getText());
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            display.setText("Error: Division by zero");
                            return;
                        }
                        break;
                }
                display.setText(String.valueOf(result));
                num1 = result;
                operator = '\0';
            } else {
                num1 = Double.parseDouble(display.getText());
                operator = label.charAt(0);
                display.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new Exp_8_2();
    }
}
