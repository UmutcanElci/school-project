package View;

import javax.swing.*;

public class UserLogin extends JFrame {
    private JLabel userLogin;
    private JLabel userName;
    private JTextField userNameTextField1;
    private JPanel userLoginPanel;
    private JPasswordField passwordField1;
    private JButton enterButton;
    private JLabel userPassword;

    public UserLogin(){
        add(userLoginPanel);
        setSize(600,400);
        setTitle("Library entrance");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
