//Develop an AWT-based Color Selection Application containing buttons or other suitable controls for selecting different colors. When the user selects a color, change the background color of the Panel or Frame. Identify and use the appropriate event source, event class, and listener interface for handling the user actions.


import java.awt.*;
import java.awt.event.*;

class ColorSelection extends Frame implements ActionListener {

    Button red, green, blue, yellow;
    Panel panel;

    ColorSelection() {

        setTitle("Color Selection");
        setSize(500, 300);

        panel = new Panel();
        panel.setLayout(new FlowLayout());

        red = new Button("Red");
        green = new Button("Green");
        blue = new Button("Blue");
        yellow = new Button("Yellow");

        panel.add(red);
        panel.add(green);
        panel.add(blue);
        panel.add(yellow);

        add(panel);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == red)
            panel.setBackground(Color.RED);

        else if (e.getSource() == green)
            panel.setBackground(Color.GREEN);

        else if (e.getSource() == blue)
            panel.setBackground(Color.BLUE);

        else if (e.getSource() == yellow)
            panel.setBackground(Color.YELLOW);
    }

    public static void main(String[] args) {
        new ColorSelection();
    }
}