
package View;

import Helper.Helper;

import javax.swing.*;

public class LibraryManagement extends JFrame {
    private JPanel LibraryManagementPanel;
    private JTabbedPane tabbedTablePane1;
    private JButton exitButton;
    private JPanel adminFormPanel;
    private JLabel bookNameLabel;
    private JTextField bookNametextField;
    private JLabel authorLabel;
    private JTextField authorTextField1;
    private JLabel pagesLabel;
    private JTextField pagesTextField1;
    private JButton saveButton1;
    private JButton editButton;
    private JButton deleteButton;
    private JPanel searchPanel;
    private JTextField textField1;
    private JButton searchButton;
    private JTable adminJtable;


    public LibraryManagement(){

        add(LibraryManagementPanel);
        setSize(1000,500);
        setLocation(Helper.screenCenter("x",getSize()),Helper.screenCenter("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Library Management System");
        setVisible(true);

    }
    public static void main(String[] args){
        Helper.setLayout();
        LibraryManagement LM = new LibraryManagement();






    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}