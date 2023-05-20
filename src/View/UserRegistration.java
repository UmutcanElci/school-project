package View;

import Helper.Config;
import Model.Manager.UserDao;
import Model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.SimpleTimeZone;

public class UserRegistration extends JFrame {
    public JPanel userRegistrationPanel;
    private JTextField usernameTextField;
    private JLabel userRegistrationName;
    private JLabel registrationPasswordField;
    private JPasswordField passwordField;
    private JLabel confirmPasswordField;
    private JPasswordField confPasswordField;
    private JLabel emailName;
    private JTextField emailTextField;
    private JLabel registrationName;
    private JButton userRegistrationButton1;
    private JButton backButton;

    public UserRegistration() {
        add(userRegistrationPanel);
        setSize(600, 400);
        setResizable(false);
        setTitle("Library menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Library library = new Library();
                Config.CenterWindow(library);
                dispose();
            }
        });
        userRegistrationButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = usernameTextField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confPasswordField.getPassword());
                String email = emailTextField.getText();
                if (!Objects.equals(userName, "") && !Objects.equals(password, "") && !Objects.equals(email, "") && !Objects.equals(confirmPassword, "")) {
                    if(password.equals(confirmPassword) ) {
                        if (email.contains("@") && (email.contains(".com") || email.contains(".edu"))) {
                            User newUser = new User(userName, password, email);
                            if (UserDao.register(newUser))
                                JOptionPane.showMessageDialog(null, "Registration Complete!");
                            else
                                JOptionPane.showMessageDialog(null, "Something Went Wrong!");
                        } else {
                            JOptionPane.showMessageDialog(null, "That is not an email address!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Confirm password mismatch!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Enter all credentials!");
                }
            }
        });
    }
}
