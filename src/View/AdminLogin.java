package View;

import Helper.Config;

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
    private JButton backButton;

    public AdminLogin(){
        add(adminPanel);
        setSize(600,400);
        setTitle("Library menu");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

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
