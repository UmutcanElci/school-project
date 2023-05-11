package Helper;

public class Config {
    public static final String PROJECT_NAME = "Library Management System";
    public static final String ADMIN_USERNAME = "admin";
    public static final String ADMIN_PASSWORD = "admin";

    //DB-Books
    public static final String SQL_GET_ALL = "SELECT * FROM books";
    public static final String SQL_INSERT = "INSERT INTO books (title, author, page_count, volume) VALUES (?,?,?,?)";
    public static final String SQL_DELETE = "DELETE FROM books WHERE id = ?";
    public static final String SQL_UPDATE = "UPDATE books SET title=?, author=?, page_count=?, volume=? WHERE id = ?";
}
