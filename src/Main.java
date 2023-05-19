//import Helper.DBServerConnector;
import Helper.Helper;
import View.*;

import javax.swing.*;
import java.sql.*;

public class Main {
    //jdbc:sqlite:sample.db
    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db")) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT title FROM books");
            while (resultSet.next()) {
                String title = resultSet.getString("title");
                System.out.println(title);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String query = "SELECT * FROM public.books";
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }catch(InstantiationException e){
            throw new RuntimeException(e);
        }catch(IllegalAccessException e){
            throw new RuntimeException(e);
        }catch(UnsupportedLookAndFeelException e){
            throw new RuntimeException(e);
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AdminLogin adminLogin = new AdminLogin();
                adminLogin.setVisible(true);
                UserLogin userLogin = new UserLogin();
                userLogin.setVisible(true);
                Library library = new Library();
                library.setVisible(true);
                UserRegistration userRegistration = new UserRegistration();
                userRegistration.setVisible(true);
              



            }
        });

    }
}