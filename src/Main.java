import Helper.Config;
import View.AdminLogin;
import View.Library;
import View.TableTest;
import View.UserLogin;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Config.CenterWindow(library);
    }
}