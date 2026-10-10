//write a java program to create a student mark list using swing  Components and Layout Managers.



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StudentMarkList extends JFrame implements ActionListener {

    JTextField nameField, regField;
    JTextField mark1, mark2, mark3;
    JTextArea result;

    JButton calculate, clear, exit;

    StudentMarkList() {

        setTitle("Student Mark List");
        setSize(500, 450);
        setLayout(new GridLayout(8, 2, 10, 10));

        add(new JLabel("Student Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Register Number:"));
        regField = new JTextField();
        add(regField);

        add(new JLabel("Subject 1 Mark:"));
        mark1 = new JTextField();
        add(mark1);

        add(new JLabel("Subject 2 Mark:"));
        mark2 = new JTextField();
        add(mark2);

        add(new JLabel("Subject 3 Mark:"));
        mark3 = new JTextField();
        add(mark3);

        calculate = new JButton("Calculate");
        clear = new JButton("Clear");
        exit = new JButton("Exit");

        add(calculate);
        add(clear);

        add(exit);

        result = new JTextArea();
        result.setEditable(false);

        add(result);

        calculate.addActionListener(this);
        clear.addActionListener(this);
        exit.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == calculate) {

            try {

                double m1 = Double.parseDouble(mark1.getText());
                double m2 = Double.parseDouble(mark2.getText());
                double m3 = Double.parseDouble(mark3.getText());

                if (m1 < 0 || m1 > 100 ||
                    m2 < 0 || m2 > 100 ||
                    m3 < 0 || m3 > 100) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Marks must be between 0 and 100");
                    return;
                }

                double total = m1 + m2 + m3;
                double average = total / 3;

                String grade;

                if (average >= 90)
                    grade = "A";
                else if (average >= 80)
                    grade = "B";
                else if (average >= 70)
                    grade = "C";
                else if (average >= 60)
                    grade = "D";
                else
                    grade = "F";

                result.setText(
                        "Name: " + nameField.getText()
                        + "\nRegister Number: " + regField.getText()
                        + "\nTotal: " + total
                        + "\nAverage: " + average
                        + "\nGrade: " + grade
                );

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Enter valid marks");
            }
        }

        if (e.getSource() == clear) {

            nameField.setText("");
            regField.setText("");
            mark1.setText("");
            mark2.setText("");
            mark3.setText("");
            result.setText("");
        }

        if (e.getSource() == exit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new StudentMarkList();
    }
}