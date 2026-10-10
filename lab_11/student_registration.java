//write a java program to create a student registration form using swing  Components and Layout Managers.



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StudentRegistration extends JFrame implements ActionListener {

    JTextField nameField, regField;
    JRadioButton male, female;
    JComboBox<String> courseBox;
    JCheckBox sports, music, reading;
    JButton submit, clear;

    StudentRegistration() {

        setTitle("Student Registration Form");
        setSize(500, 400);
        setLayout(new GridLayout(7, 2, 10, 10));

        // Name
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        // Register Number
        add(new JLabel("Register Number:"));
        regField = new JTextField();
        add(regField);

        // Gender
        add(new JLabel("Gender:"));

        JPanel genderPanel = new JPanel();

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        genderPanel.add(male);
        genderPanel.add(female);

        add(genderPanel);

        // Course
        add(new JLabel("Course:"));

        String courses[] = {
            "Computer Science",
            "Information Technology",
            "Computational Science",
            "BCA"
        };

        courseBox = new JComboBox<>(courses);
        add(courseBox);

        // Hobbies
        add(new JLabel("Hobbies:"));

        JPanel hobbyPanel = new JPanel();

        sports = new JCheckBox("Sports");
        music = new JCheckBox("Music");
        reading = new JCheckBox("Reading");

        hobbyPanel.add(sports);
        hobbyPanel.add(music);
        hobbyPanel.add(reading);

        add(hobbyPanel);

        // Buttons
        submit = new JButton("Submit");
        clear = new JButton("Clear");

        add(submit);
        add(clear);

        submit.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {

            String gender = "";

            if (male.isSelected())
                gender = "Male";
            else if (female.isSelected())
                gender = "Female";

            String hobbies = "";

            if (sports.isSelected())
                hobbies += "Sports ";

            if (music.isSelected())
                hobbies += "Music ";

            if (reading.isSelected())
                hobbies += "Reading";

            String message =
                    "Name: " + nameField.getText()
                    + "\nRegister Number: " + regField.getText()
                    + "\nGender: " + gender
                    + "\nCourse: " + courseBox.getSelectedItem()
                    + "\nHobbies: " + hobbies;

            JOptionPane.showMessageDialog(this, message);
        }

        if (e.getSource() == clear) {

            nameField.setText("");
            regField.setText("");

            male.setSelected(false);
            female.setSelected(false);

            courseBox.setSelectedIndex(0);

            sports.setSelected(false);
            music.setSelected(false);
            reading.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}