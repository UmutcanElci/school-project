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
                JFrame adminFrame = new JFrame("Admin Login");
                Config.CenterWindow(adminFrame);
                adminFrame.add(new AdminLogin().adminPanel);
                adminFrame.pack();
                adminFrame.setVisible(true);
                dispose();
            }
        });
        userLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame userFrame = new JFrame("User Login");
                Config.CenterWindow(userFrame);
                userFrame.add(new UserLogin().userLoginPanel);
                userFrame.pack();
                userFrame.setVisible(true);
                dispose();
            }
        });
        userRegistration.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame userRegFrame = new JFrame("User Registration");
                Config.CenterWindow(userRegFrame);
                userRegFrame.add(new UserRegistration().userRegistrationPanel);
                userRegFrame.pack();
                userRegFrame.setVisible(true);
                dispose();
            }
        });
    }
}
