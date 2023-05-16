package View;

import Helper.Config;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JButton backButton;

    public UserRegistration(){
        add(userRegistrationPanel);
        setSize(600,400);
        setTitle("Library menu");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
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
