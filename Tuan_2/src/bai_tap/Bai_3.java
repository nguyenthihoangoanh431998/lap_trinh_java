package bai_tap;

import javax.swing.*;
import java.awt.*;

public class Bai_3 extends JFrame {
    public Bai_3 (String title)
    {
        super(title);
        setVisible(true);
        setSize(600,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel pnBox = new JPanel();
        pnBox.setLayout( new BoxLayout(pnBox, BoxLayout.X_AXIS));
        pnBox.setBackground( Color.yellow);
        JButton btn1= new JButton("ALL RISE");
        btn1.setForeground(Color.PINK);
        Font font = new Font("Times New Roman", Font.BOLD | Font.ITALIC,20);
        btn1.setFont(font);
        pnBox.add(btn1);
        JButton btn2= new JButton("LOVE SONG");
        btn2.setForeground(Color.CYAN);
        btn2.setFont(font);
        pnBox.add(btn2);
        JButton btn3= new JButton("BLOW");
        btn3.setForeground(Color.darkGray);
        btn3.setFont(font);
        pnBox.add(btn3);
        add(pnBox);

    }

    public static void main(String[] args) {new Bai_3("Bai_3");
    }
}
