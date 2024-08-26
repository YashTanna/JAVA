import java.awt.*;
import java.awt.event.*;

public class  Exp_6_1 {
    private static int mouseX;
    private static int mouseY;

    public static void main(String[] args) {
        Frame frame = new Frame("Mouse Position Display");

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
                frame.repaint();
            }
        });

        frame.setSize(400, 400);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        String str = "Mouse X: " + mouseX + ", Mouse Y:"+" " + mouseY;
        g.drawString(str + mouseY, mouseX, mouseY);
    }
}
