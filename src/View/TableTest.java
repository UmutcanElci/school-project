package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class TableTest {
    String header[] = {"ID", "Title", "Author", "Page Count", "Volume"};
    public JPanel panel1;
    private JTable table1;

    private void createUIComponents() {
        // TODO: place custom component creation code here
        DefaultTableModel model = new DefaultTableModel(0, 15);
        model.setColumnIdentifiers(header);
        table1 = new JTable(model);
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db")) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM books");
            while (resultSet.next()) {
                Object[] row = {resultSet.getString("id"), resultSet.getString("title"),
                        resultSet.getString("author"), resultSet.getInt("page_count"),
                        resultSet.getInt("volume")};
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
