import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Moving extends Frame implements KeyListener {


    int kx = 150;
    int ky = 150;
    Moving()
    {
        setSize(500,500);
        setVisible(true);
        addKeyListener(this);
    }

    public static void main(String[] args) {
        Moving m = new Moving();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode())
        {
            case KeyEvent.VK_DOWN:
                ky += 10;
                break;
            case KeyEvent.VK_UP:
                ky -= 10;
                break;
            case KeyEvent.VK_LEFT:
                kx -= 10;
                break;
            case KeyEvent.VK_RIGHT:
                kx += 10;
                break;
        }
        repaint();
    }

    public void paint(Graphics g)
    {
        g.drawString("YASH",kx,ky);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
