import java.awt.*;
import java.awt.Graphics.*;
import java.awt.event.*;

public class KeyEvent_Class extends Frame implements KeyListener{

    TextArea ta;
    KeyEvent_Class()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
        ta = new TextArea();
        add(ta);
        ta.addKeyListener(this);
    }

    public static void main(String[] args) {
        KeyEvent_Class k = new KeyEvent_Class();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        ta.append("Enter key is "+ e.getKeyChar()+"\n");
        ta.append("Code of entered key is "+ e.getKeyCode()+"\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
