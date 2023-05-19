package View;

import Helper.DbConnection;
import Model.Books;
import Model.Manager.BookDao;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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
    private JPanel deleteBookPanel;
    private JLabel idLabel;
    private JButton deleteBookButton;
    private JTextField idTextField;
    private JButton updateBookButton;

    public TableTest() {
        addDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Books book = new Books(titleTextField.getText(), authorTextField.getText(),
                            Integer.parseInt(pCountTextField.getText()), Integer.parseInt(volumeTextField.getText()));
                    BookDao.add(book);
                    RefreshTableModel();
                    JOptionPane.showMessageDialog(panel1, "Book Added to Database Successfully!");
                    ClearTextBoxes();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        deleteBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int delBookId = Integer.parseInt(idTextField.getText());
                    for (Books book: BookDao.getAllBooks()) {
                        if(book.getId() == delBookId)
                            BookDao.delete(book.getId());
                    }
                    RefreshTableModel();
                    JOptionPane.showMessageDialog(panel1, "Book Deleted from Database Successfully!");
                    ClearTextBoxes();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        updateBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int updateBookId = Integer.parseInt(idTextField.getText());
                    Books updatedBook = new Books(titleTextField.getText(), authorTextField.getText(),
                            Integer.parseInt(pCountTextField.getText()), Integer.parseInt(volumeTextField.getText()));
                    updatedBook.setId(updateBookId);
                    for (Books book: BookDao.getAllBooks()) {
                        if(book.getId() == updateBookId)
                            BookDao.update(updatedBook,book.getId());
                    }
                    RefreshTableModel();
                    JOptionPane.showMessageDialog(panel1, "Book Information Updated Successfully!");
                    ClearTextBoxes();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    private void ClearTextBoxes() {
        titleTextField.setText("");
        authorTextField.setText("");
        pCountTextField.setText("");
        volumeTextField.setText("");
        idTextField.setText("");
    }

    private void RefreshTableModel() {
        try {
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
            ex.printStackTrace();
        }
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
