import Model.Books;
import Model.Manager.BookDao;
import View.TableTest;

import javax.swing.*;
import java.awt.print.Book;
import java.sql.*;

public class Main {
    //jdbc:sqlite:sample.db
    public static void main(String[] args) {

//        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db")) {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT title FROM books");
//            while (resultSet.next()) {
//                String title = resultSet.getString("title");
//                System.out.println(title);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        JFrame frame = new JFrame();
        frame.add(new TableTest().panel1);
        frame.pack();
        frame.setSize(800, 250);
        frame.setVisible(true);

        String query = "SELECT * FROM public.books";
    }
}