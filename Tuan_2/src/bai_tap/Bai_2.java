package bai_tap;

import javax.swing.*;
import java.awt.*;

public class Bai_2 extends JFrame
{
    public Bai_2 (String title)
    {
        super(title);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600 ,200);
        setLocationRelativeTo(null);
        JPanel pnFlow = new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground( Color.blue);
        JButton btn1 = new JButton("FlowLayOut");
        JButton btn2 = new JButton("Add Các Control");
        JButton btn3 = new JButton("Trên 1 dòng");
        JButton btn4 = new JButton("Hết chỗ chứa");
        JButton btn5 = new JButton("Thì xuống dòng");
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        add(pnFlow);
    }

    public static void main(String[] args) {
        new Bai_2 ("Bai_2");
    }
}
