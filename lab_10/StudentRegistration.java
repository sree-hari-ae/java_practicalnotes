//write a java program to create a student registration form using AWT  Components and Layout Managers.


import java.awt.*;
import java.awt.event.*;

class StudentRegistration extends Frame implements ActionListener {

    TextField name, regno;
    Choice course;
    Checkbox male, female;
    Button submit, clear;
    Label result;

    StudentRegistration() {

        setTitle("Student Registration Form");
        setSize(500, 400);
        setLayout(new GridLayout(7, 2, 10, 10));

        // Name
        add(new Label("Name:"));
        name = new TextField();
        add(name);

        // Register Number
        add(new Label("Register Number:"));
        regno = new TextField();
        add(regno);

        // Course
        add(new Label("Course:"));
        course = new Choice();
        course.add("Computer Science");
        course.add("Information Technology");
        course.add("Computational Science");
        course.add("BCA");
        add(course);

        // Gender
        add(new Label("Gender:"));

        Panel genderPanel = new Panel();

        male = new Checkbox("Male");
        female = new Checkbox("Female");

        genderPanel.add(male);
        genderPanel.add(female);

        add(genderPanel);

        // Buttons
        submit = new Button("Submit");
        clear = new Button("Clear");

        add(submit);
        add(clear);

        result = new Label("Enter details and click Submit");
        add(result);

        submit.addActionListener(this);
        clear.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

            String gender = "";

            if (male.getState())
                gender = "Male";
            else if (female.getState())
                gender = "Female";

            result.setText("Name: " + name.getText()
                    + " | Reg No: " + regno.getText()
                    + " | Course: " + course.getSelectedItem()
                    + " | Gender: " + gender);
        }

        if (e.getSource() == clear) {
            name.setText("");
            regno.setText("");
            result.setText("Enter details and click Submit");
        }
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}