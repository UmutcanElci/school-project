package View;

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
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Library Management System | User");
    setVisible(true);
   }
}
