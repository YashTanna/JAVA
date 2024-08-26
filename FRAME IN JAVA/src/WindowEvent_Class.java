import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEvent_Class extends Frame implements WindowListener {


    WindowEvent_Class()
    {
        setSize(500,500);
        setVisible(true);
        addWindowListener(this);
    }

    public static void main(String[] args) {
        WindowEvent_Class q = new WindowEvent_Class();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("windowOpened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("windowClosing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("windowClosed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("windowIconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("windowDeiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("windowActivated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("windowDeactivated");
    }
}
