//wite a java program to create a library book management system using swing  Components and Layout Managers.


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

class LibraryManagement extends JFrame implements ActionListener {

    JTextField idField, titleField, authorField;

    JComboBox<String> categoryBox;

    JButton add, delete, clear;

    JTable table;
    DefaultTableModel model;

    LibraryManagement() {

        setTitle("Library Book Management");
        setSize(700, 500);

        setLayout(new BorderLayout());

        // Input panel
        JPanel inputPanel = new JPanel(
                new GridLayout(5, 2, 10, 10));

        inputPanel.add(new JLabel("Book ID:"));
        idField = new JTextField();
        inputPanel.add(idField);

        inputPanel.add(new JLabel("Book Title:"));
        titleField = new JTextField();
        inputPanel.add(titleField);

        inputPanel.add(new JLabel("Author:"));
        authorField = new JTextField();
        inputPanel.add(authorField);

        inputPanel.add(new JLabel("Category:"));

        String categories[] = {
                "Programming",
                "Database",
                "Networking",
                "Science",
                "Other"
        };

        categoryBox = new JComboBox<>(categories);
        inputPanel.add(categoryBox);

        add = new JButton("Add Book");
        delete = new JButton("Delete Book");
        clear = new JButton("Clear");

        inputPanel.add(add);
        inputPanel.add(delete);

        add(inputPanel, BorderLayout.NORTH);

        // Table
        String columns[] = {
                "Book ID",
                "Title",
                "Author",
                "Category"
        };

        model = new DefaultTableModel(columns, 0);

        table = new JTable(model);

        add(new JScrollPane(table), BorderLayout.CENTER);

        // Clear button
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(clear);

        add(bottomPanel, BorderLayout.SOUTH);

        add.addActionListener(this);
        delete.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        // Add book
        if (e.getSource() == add) {

            String id = idField.getText();
            String title = titleField.getText();
            String author = authorField.getText();
            String category =
                    categoryBox.getSelectedItem().toString();

            if (id.isEmpty() ||
                title.isEmpty() ||
                author.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter all details");

                return;
            }

            model.addRow(new Object[]{
                    id, title, author, category
            });

            clearFields();

            JOptionPane.showMessageDialog(
                    this,
                    "Book added successfully");
        }

        // Delete book
        if (e.getSource() == delete) {

            int row = table.getSelectedRow();

            if (row == -1) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please select a row to delete");

            } else {

                model.removeRow(row);

                JOptionPane.showMessageDialog(
                        this,
                        "Book deleted successfully");
            }
        }

        // Clear fields
        if (e.getSource() == clear) {
            clearFields();
        }
    }

    void clearFields() {

        idField.setText("");
        titleField.setText("");
        authorField.setText("");
        categoryBox.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        new LibraryManagement();
    }
}