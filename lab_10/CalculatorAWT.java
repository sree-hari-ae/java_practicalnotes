//Create a Simple Calculator using Java AWT. Use TextField components for input and Button controls for addition, subtraction, multiplication, and division. Implement event handling using ActionListener. Handle invalid input and division-by-zero situations appropriately. 


import java.awt.*;
import java.awt.event.*;

class AWTCalculator extends Frame implements ActionListener {

    TextField num1, num2, result;
    Button add, sub, mul, div;

    AWTCalculator() {

        setTitle("Simple Calculator");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new Label("First Number:"));
        num1 = new TextField();
        add(num1);

        add(new Label("Second Number:"));
        num2 = new TextField();
        add(num2);

        add(new Label("Result:"));
        result = new TextField();
        result.setEditable(false);
        add(result);

        add = new Button("Add");
        sub = new Button("Subtract");
        mul = new Button("Multiply");
        div = new Button("Divide");

        add(add);
        add(sub);
        add(mul);
        add(div);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

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
                    result.setText("Cannot divide by zero");
                    return;
                }

                answer = a / b;
            }

            result.setText(String.valueOf(answer));

        } catch (NumberFormatException ex) {

            result.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new AWTCalculator();
    }
}