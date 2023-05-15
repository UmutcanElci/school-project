package View;

import Helper.Config;
import Helper.DbConnection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class TableTest {
    public JPanel panel1;
    String header[] = {"ID", "Title", "Author", "Page Count", "Volume"};
    private JTable table1;
    private JPanel addBookPanel;
    private JTextField titleTextField;
    private JTextField authorTextField;
    private JTextField pCountTextField;
    private JTextField volumeTextField;
    private JLabel titleLabel;
    private JLabel authorLabel;
    private JLabel pCountLabel;
    private JLabel volumeLabel;
    private JButton addDataButton;
    private JTextField idTextField;
    private JLabel idLabel;

    public TableTest() {
        addDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    PreparedStatement pr = DbConnection.getInstance().prepareStatement(Config.SQL_UPDATE);
                    pr.setString(1, titleTextField.getText());
                    pr.setString(2, authorTextField.getText());
                    pr.setInt(3, Integer.parseInt(pCountTextField.getText()));
                    pr.setInt(4, Integer.parseInt(volumeTextField.getText()));
                    pr.setInt(5, Integer.parseInt(idTextField.getText()));
                    pr.executeUpdate();
                    DefaultTableModel model = (DefaultTableModel) table1.getModel();
                    model.setRowCount(0);

                    Statement statement = DbConnection.getInstance().createStatement();
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM books");
                    while (resultSet.next()) {
                        Object[] row = {resultSet.getString("id"), resultSet.getString("title"),
                                resultSet.getString("author"), resultSet.getInt("page_count"),
                                resultSet.getInt("volume")};
                        model.addRow(row);
                    }

                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

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
