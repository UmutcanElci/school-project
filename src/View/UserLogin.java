package View;

import Helper.Config;
import Model.Manager.UserDao;

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
    private JButton backButton;

    public UserLogin(){
        add(userLoginPanel);
        setSize(600,400);
        setResizable(false);
        setTitle("Library menu");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(UserDao.loginFetch(userNameTextField1.getText(), new String(passwordField1.getPassword()))) {
                    JOptionPane.showMessageDialog(null, "Logged In.");
                } else {
                    JOptionPane.showMessageDialog(null,"Username or password was incorrect.");
                }
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Library library = new Library();
                Config.CenterWindow(library);
                dispose();
            }
        });
    }

}
