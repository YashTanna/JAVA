import java.awt.*;
import java.awt.event.*;

public class Exp_7_2 extends Frame {
    private Canvas canvas = new Canvas();
    private CheckboxGroup shapeGroup = new CheckboxGroup();
    private Checkbox circleCheckbox = new Checkbox("Circle", shapeGroup, false);
    private Checkbox rectangleCheckbox = new Checkbox("Rectangle", shapeGroup, false);
    private Checkbox triangleCheckbox = new Checkbox("Triangle", shapeGroup, false);

    public Exp_7_2() {
        setTitle("Shape Drawer");
        setSize(400, 400);
        setLayout(new BorderLayout());

        add(canvas, BorderLayout.CENTER);

        Panel controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        controlPanel.add(circleCheckbox);
        controlPanel.add(rectangleCheckbox);
        controlPanel.add(triangleCheckbox);

        circleCheckbox.addItemListener(new ShapeItemListener());
        rectangleCheckbox.addItemListener(new ShapeItemListener());
        triangleCheckbox.addItemListener(new ShapeItemListener());

        add(controlPanel, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    class ShapeItemListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                canvas.getGraphics().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                String selectedShape = shapeGroup.getSelectedCheckbox().getLabel();
                Graphics g = canvas.getGraphics();

                if (selectedShape.equals("Circle")) {
                    g.setColor(Color.RED);
                    g.fillOval(50, 50, 100, 100);
                } else if (selectedShape.equals("Rectangle")) {
                    g.setColor(Color.BLUE);
                    g.fillRect(50, 50, 150, 100);
                } else if (selectedShape.equals("Triangle")) {
                    g.setColor(Color.GREEN);
                    int[] xPoints = {100, 50, 150};
                    int[] yPoints = {50, 150, 150};
                    g.fillPolygon(xPoints, yPoints, 3);
                }
            }
        }
    }

    public static void main(String[] args) {
        Exp_7_2 shapeDrawer = new Exp_7_2();
        shapeDrawer.setVisible(true);
    }
}
