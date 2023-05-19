package View;

<<<<<<< HEAD
import Helper.Helper;
=======
import Helper.Config;
>>>>>>> 07fa477d02b555e25a0e96715cb6d1ac3f9ea7f1

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class UserLogin extends JFrame {
    private JLabel userLogin;
    private JLabel userName;
    private JTextField userNameTextField1;
    public JPanel userLoginPanel;
    private JPasswordField passwordField1;
    private JButton enterButton;
    private JLabel userPassword;

    public UserLogin(){
        add(userLoginPanel);
        setSize(600,400);
        setTitle("Library menu");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = "test";
                String password = "test";
                if(userNameTextField1.getText().equals(username) &&
                        Arrays.equals(passwordField1.getPassword(), password.toCharArray())) {
                    JOptionPane.showMessageDialog(null, "Logged In.");
                } else {
                    JOptionPane.showMessageDialog(null,"Username or password was incorrect.");
                }
            }
        });
    }

}
