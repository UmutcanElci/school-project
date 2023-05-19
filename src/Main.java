import Helper.Config;
import Model.Books;
import View.AdminLogin;
import View.Library;
import View.TableTest;
import View.UserLogin;

import javax.swing.*;
import java.util.ArrayList;

import static Model.Manager.BookDao.getAllBooks;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Config.CenterWindow(library);


    }
}