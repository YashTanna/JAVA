import java.awt.*;
import java.awt.event.*;

public class MouseListener_Class extends Frame implements MouseListener,MouseMotionListener{

    MouseListener_Class()
    {
        setVisible(true);
        setSize(500,500);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        MouseListener_Class m = new MouseListener_Class();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        setBackground(Color.RED);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        setBackground(Color.YELLOW);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setBackground(Color.blue);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground(Color.BLACK);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(Color.PINK);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        setBackground(Color.ORANGE);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        setBackground(Color.CYAN);
    }
}
