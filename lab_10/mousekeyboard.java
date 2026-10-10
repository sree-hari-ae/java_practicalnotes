//Develop an AWT application that displays the current mouse position inside a Frame. The application should respond to mouse clicks, mouse movement, and keyboard events. Use appropriate event listener interfaces and demonstrate the use of adapter classes to avoid implementing unnecessary listener methods. 


import java.awt.*;
import java.awt.event.*;

class MouseKeyboard extends Frame {

    Label message;

    MouseKeyboard() {

        setTitle("Mouse and Keyboard Events");
        setSize(500, 300);
        setLayout(new FlowLayout());

        message = new Label("Move mouse or press a key");
        add(message);

        // Mouse Adapter
        addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                message.setText("Mouse clicked at X = "
                        + e.getX() + ", Y = " + e.getY());
            }
        });

        // Mouse Motion Adapter
        addMouseMotionListener(new MouseMotionAdapter() {

            public void mouseMoved(MouseEvent e) {
                message.setText("Mouse Position: X = "
                        + e.getX() + ", Y = " + e.getY());
            }
        });

        // Keyboard Adapter
        addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e) {
                message.setText("Key pressed: "
                        + e.getKeyChar());
            }
        });

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);

        requestFocus();
    }

    public static void main(String[] args) {
        new MouseKeyboard();
    }
}