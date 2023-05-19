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

public class AdminLogin extends JFrame{
    private JPasswordField userpasswordField;
    private JTextField userTextField;
    private JButton enterButton;
    private JLabel adminLogin;
    private JLabel userPassword;
    public JPanel adminPanel;

    public AdminLogin(){
        add(adminPanel);
        setSize(600,400);
        setTitle("Library menu");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(userTextField.getText().equals(Config.ADMIN_USERNAME) &&
                        Arrays.equals(userpasswordField.getPassword(), Config.ADMIN_PASSWORD.toCharArray())) {
                    JOptionPane.showMessageDialog(null, "Logged In.");
                } else {
                    JOptionPane.showMessageDialog(null,"Username or password was incorrect.");
                }
            }
        });
    }
}
