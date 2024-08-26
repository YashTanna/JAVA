import java.awt.*;
import java.awt.event.*;

public class Exp_10_1 {
    private Frame frame;
    private TextField messageField, colorField, sizeField;
    private Choice directionChoice;
    private Button startButton;
    private int x, dx;
    private String message;
    private Color textColor;
    private int fontSize;

    public Exp_10_1() {
        frame = new Frame("Moving Banner");
        frame.setSize(500, 100);

        messageField = new TextField("Enter message");
        colorField = new TextField("Color");
        sizeField = new TextField("Font Size");
        directionChoice = new Choice();
        directionChoice.add("Left");
        directionChoice.add("Right");
        startButton = new Button("Start");

        frame.setLayout(new BorderLayout());
        frame.add(new Panel() {{
            setLayout(new GridLayout(1, 5));
            add(messageField);
            add(colorField);
            add(sizeField);
            add(directionChoice);
            add(startButton);
        }}, BorderLayout.NORTH);

        startButton.addActionListener(e -> {
            if (startButton.getLabel().equals("Start")) {
                initializeValues();
                startButton.setLabel("Stop");
                startMovingBanner();
            } else {
                stopMovingBanner();
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    private void initializeValues() {
        message = messageField.getText();
        textColor = Color.decode(colorField.getText());
        fontSize = Integer.parseInt(sizeField.getText());
        x = directionChoice.getSelectedIndex() == 0 ? frame.getWidth() : -200;
    }

    private void startMovingBanner() {
        dx = directionChoice.getSelectedIndex() == 0 ? -1 : 1;

        new Thread(() -> {
            while (true) {
                x += dx;
                if ((x < -200 && dx < 0) || (x > frame.getWidth() && dx > 0)) {
                    stopMovingBanner();
                }
                frame.repaint();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void stopMovingBanner() {
        startButton.setLabel("Start");
    }

    public void paint(Graphics g) {
        g.setColor(textColor);
        g.setFont(new Font("Arial", Font.BOLD, fontSize));
        g.drawString(message, x, frame.getHeight() / 2);
    }

    public static void main(String[] args) {
        new Exp_10_1();
    }
}
