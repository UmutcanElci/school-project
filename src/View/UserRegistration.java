package View;

import javax.swing.*;

public class UserRegistration extends JFrame{
    public JPanel userRegistrationPanel;
    private JTextField textField1;
    private JLabel userRegistrationName;
    private JLabel registrationPasswordField;
    private JPasswordField passwordField1;
    private JLabel confirmPasswordField;
    private JPasswordField passwordField2;
    private JLabel emailName;
    private JTextField textField2;
    private JLabel registrationName;
    private JButton userRegistrationButton1;

    public UserRegistration(){
        add(userRegistrationPanel);
        setSize(600,400);
        setTitle("Library menu");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
