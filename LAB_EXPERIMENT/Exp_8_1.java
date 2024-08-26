import java.awt.*;
import java.awt.event.*;

public class Exp_8_1 extends Frame implements ItemListener {
    private CheckboxMenuItem redLight, yellowLight, greenLight;

    public Exp_8_1() {
        setTitle("Traffic Light Simulator");
        setSize(200, 300);
        setLayout(new FlowLayout());

        MenuBar menuBar = new MenuBar();
        setMenuBar(menuBar);

        Menu lightMenu = new Menu("Select Light");
        menuBar.add(lightMenu);

        redLight = new CheckboxMenuItem("Red Light");
        yellowLight = new CheckboxMenuItem("Yellow Light");
        greenLight = new CheckboxMenuItem("Green Light");

        redLight.addItemListener(this);
        yellowLight.addItemListener(this);
        greenLight.addItemListener(this);

        lightMenu.add(redLight);
        lightMenu.add(yellowLight);
        lightMenu.add(greenLight);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        redLight.setState(false);
        yellowLight.setState(false);
        greenLight.setState(false);

        CheckboxMenuItem selectedLight = (CheckboxMenuItem) e.getSource();
        selectedLight.setState(true);

        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(80, 50, 40, 120);

        if (redLight.getState()) {
            g.setColor(Color.RED);
            g.fillOval(90, 60, 20, 20);
        } else if (yellowLight.getState()) {
            g.setColor(Color.YELLOW);
            g.fillOval(90, 90, 20, 20);
        } else if (greenLight.getState()) {
            g.setColor(Color.GREEN);
            g.fillOval(90, 120, 20, 20);
        }
    }

    public static void main(String[] args) {
        new Exp_8_1();
    }
}
