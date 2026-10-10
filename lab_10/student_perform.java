//Design and implement a Student Performance Management System using Java AWT. The interface should contain text fields for student details, controls for entering marks, buttons for calculating total and average, and a suitable component for displaying the result. Use Frame, Panel, appropriate layout managers, AWT controls, and event listeners. Include suitable window-closing event handling using an adapter class.



import java.awt.*;
import java.awt.event.*;

class StudentPerformance extends Frame implements ActionListener {

    TextField name, regno;
    TextField mark1, mark2, mark3;
    Button calculate, clear;
    Label result;

    StudentPerformance() {

        setTitle("Student Performance Management");
        setSize(500, 400);

        setLayout(new GridLayout(7, 2, 10, 10));

        // Student Name
        add(new Label("Student Name:"));
        name = new TextField();
        add(name);

        // Register Number
        add(new Label("Register Number:"));
        regno = new TextField();
        add(regno);

        // Mark 1
        add(new Label("Mark 1:"));
        mark1 = new TextField();
        add(mark1);

        // Mark 2
        add(new Label("Mark 2:"));
        mark2 = new TextField();
        add(mark2);

        // Mark 3
        add(new Label("Mark 3:"));
        mark3 = new TextField();
        add(mark3);

        // Buttons
        calculate = new Button("Calculate");
        clear = new Button("Clear");

        add(calculate);
        add(clear);

        result = new Label("Enter marks and click Calculate");
        add(result);

        calculate.addActionListener(this);
        clear.addActionListener(this);

        // Window closing
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == calculate) {

            try {

                double m1 = Double.parseDouble(mark1.getText());
                double m2 = Double.parseDouble(mark2.getText());
                double m3 = Double.parseDouble(mark3.getText());

                double total = m1 + m2 + m3;
                double average = total / 3;

                result.setText("Total = " + total
                        + "   Average = " + average);

            } catch (NumberFormatException ex) {

                result.setText("Enter valid marks");
            }
        }

        if (e.getSource() == clear) {

            name.setText("");
            regno.setText("");
            mark1.setText("");
            mark2.setText("");
            mark3.setText("");

            result.setText("Enter marks and click Calculate");
        }
    }

    public static void main(String[] args) {
        new StudentPerformance();
    }
}