package Model.Manager;

import Helper.Config;
import Helper.DbConnection;
import Model.Books;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDao {


    public static ArrayList<Books> getAllBooks(){
        ArrayList<Books> arrayList = new ArrayList<>();
        Books obj;
        try {
            Statement st = DbConnection.getInstance().createStatement();
            ResultSet rs = st.executeQuery(Config.SQL_GET_ALL);
            while (rs.next()){
                obj = new Books();
                obj.setId(rs.getInt("id"));
                obj.setBookTitle(rs.getString("title"));
                obj.setBookAuthor(rs.getString("author"));
                obj.setBookPageCount(rs.getInt("page_count"));
                obj.setBookVolume(rs.getInt("volume"));
                arrayList.add(obj);
            }
            st.close();
            rs.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return arrayList;
    }

    public static boolean add(Books books){

        return false;
    }

    public static boolean update(Books books){

        return false;
    }

    public static boolean delete(int id){

        return false;
    }
}
