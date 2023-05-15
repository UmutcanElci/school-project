import View.TableTest;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Table Test");
        frame.add(new TableTest().panel1);
        frame.pack();
        frame.setSize(750, 400);
        frame.setVisible(true);

        String query = "SELECT * FROM public.books";
    }
}