import Helper.DBServerConnector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            String query = "SELECT * FROM public.books";
            Statement st = DBServerConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                System.out.println("Name : " + rs.getString("bookname"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
            
        }
    }
}