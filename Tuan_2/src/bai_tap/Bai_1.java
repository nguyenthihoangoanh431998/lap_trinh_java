package bai_tap;

import javax.swing.*;

public class Bai_1 extends JFrame {
    public Bai_1 (String title) {
        super(title);
        setVisible(true);
        setSize(500, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Bai_1("First App");
    }
}
