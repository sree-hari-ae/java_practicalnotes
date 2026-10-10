//write a java program to create a simple calculator using swing  Components and Layout Managers.



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingCalculator extends JFrame implements ActionListener {

    JTextField num1, num2, result;
    JButton add, sub, mul, div;

    SwingCalculator() {

        setTitle("Simple Calculator");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("First Number:"));
        num1 = new JTextField();
        add(num1);

        add(new JLabel("Second Number:"));
        num2 = new JTextField();
        add(num2);

        add(new JLabel("Result:"));
        result = new JTextField();
        result.setEditable(false);
        add(result);

        add = new JButton("Add");
        sub = new JButton("Subtract");
        mul = new JButton("Multiply");
        div = new JButton("Divide");

        add(add);
        add(sub);
        add(mul);
        add(div);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {

            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());

            double answer = 0;

            if (e.getSource() == add)
                answer = a + b;

            else if (e.getSource() == sub)
                answer = a - b;

            else if (e.getSource() == mul)
                answer = a * b;

            else if (e.getSource() == div) {

                if (b == 0) {
                    JOptionPane.showMessageDialog(
                            this,
                            "Cannot divide by zero");
                    return;
                }

                answer = a / b;
            }

            result.setText(String.valueOf(answer));

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please enter valid numbers");
        }
    }

    public static void main(String[] args) {
        new SwingCalculator();
    }
}