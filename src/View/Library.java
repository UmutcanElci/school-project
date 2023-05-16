package View;

import Helper.Config;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Library extends JFrame{
    public JPanel libraryPanel;
    private JButton adminLogin;
    private JButton userLogin;
    private JButton userRegistration;
    private JLabel librarypng;

    public Library(){
        add(libraryPanel);
        setSize(600,400);
        setTitle("Library menu");
        setVisible(true);


        adminLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminLogin adminLogin = new AdminLogin();
                Config.CenterWindow(adminLogin);
                dispose();
            }
        });
        userLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserLogin userLogin = new UserLogin();
                Config.CenterWindow(userLogin);
                dispose();
            }
        });
        userRegistration.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserRegistration userRegistration = new UserRegistration();
                Config.CenterWindow(userRegistration);
                dispose();
            }
        });
    }
}
