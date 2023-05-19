package View;

import Helper.Helper;

import javax.swing.*;

public class LibraryManagementUser extends JFrame {
    private JPanel LibraryManagementUserPanel;
    private JTabbedPane tabbedTablePane1;
    private JButton exitButton;
    private JScrollPane tableScrollPanel;
    private JTable tableUserJtable;
    private JTextField searchTextField1;
    private JButton searchButton;
    private JPanel tablePanel;
    private JPanel searchPanel;
    private JLabel welcomeName;

    public LibraryManagementUser() {

    add(LibraryManagementUserPanel);
    setSize(1000, 500);
    setLocation(Helper.screenCenter("x", getSize()), Helper.screenCenter("y", getSize()));
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setTitle("Library Management System");
    setVisible(true);
   }

    public static void main(String[] args){
        Helper.setLayout();
        LibraryManagementUser LMU = new LibraryManagementUser();


    }


}
