package swingtutorials;
import javax.swing.*;

public class Driver {
    public static void driver(){
        JFrame f = new JFrame();
        JButton b = new JButton("Hello Anand");
        b.setBounds(130, 200, 100, 40);
        f.add(b);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}