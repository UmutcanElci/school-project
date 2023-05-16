package View;

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
                adminFrame.add(new AdminLogin().adminPanel);
                adminFrame.pack();
                adminFrame.setVisible(true);
                setVisible(false);
            }
        });
        userLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame userFrame = new JFrame("Admin Login");
                userFrame.add(new UserLogin().userLoginPanel);
                userFrame.pack();
                userFrame.setVisible(true);
                setVisible(false);
            }
        });
    }
}
