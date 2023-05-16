package View;

import javax.swing.*;

public class AdminLogin extends JFrame{
    private JPasswordField userpasswordField;
    private JTextField userTextField;
    private JButton enterButton;
    private JLabel adminLogin;
    private JLabel userPassword;
    private JPanel adminPanel;

    public AdminLogin(){
        add(adminPanel);
        setSize(600,400);
        setTitle("Library menu");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
