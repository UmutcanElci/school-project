package Helper;

import javax.swing.*;
import java.awt.*;

public class Config {
    public static final String PROJECT_NAME = "Library Management System";
    public static final String ADMIN_USERNAME = "admin";
    public static final String ADMIN_PASSWORD = "admin";

    //DB-Books
    public static final String SQL_GET_ALL = "SELECT * FROM books";
    public static final String SQL_INSERT = "INSERT INTO books (title, author, page_count, volume) VALUES (?,?,?,?)";
    public static final String SQL_DELETE = "DELETE FROM books WHERE id = ?";
    public static final String SQL_UPDATE = "UPDATE books SET title=?, author=?, page_count=?, volume=? WHERE id = ?";

    public static void CenterWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }

    public static void SetLayout(){
        for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(info.getName())){
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | IllegalAccessException | UnsupportedLookAndFeelException |
                         InstantiationException e) {
                    throw new RuntimeException(e);
                }
                break;

            }
        }
    }
}
