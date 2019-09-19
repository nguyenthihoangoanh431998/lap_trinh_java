package bai_tap;

import javax.swing.*;
import java.awt.*;

public class Bai_4 extends JFrame
{
    public Bai_4 (String title)
    {
        super(title);
        setVisible(true);
        setSize(600,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel pnBorder = new JPanel();
        Font font = new Font("Times New Roman", Font.BOLD | Font.ITALIC,20);
            pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth = new JPanel();
            pnNorth.setBackground(Color.CYAN);
            JLabel lblNorth = new JLabel("NORTH");
            lblNorth.setFont(font);
            pnNorth.add(lblNorth);
            pnBorder.add(pnNorth,BorderLayout.NORTH);
        JPanel pnSouth = new JPanel();
            JLabel lblSouth = new JLabel("SOUTH");
            lblSouth.setFont(font);
            pnSouth.add(lblSouth);
            pnSouth.setBackground(Color.cyan);
            pnBorder.add(pnSouth,BorderLayout.SOUTH);
        JPanel pnWest = new JPanel();
        pnWest.setLayout(new BoxLayout(pnWest, BoxLayout.X_AXIS));
            JLabel lblWest = new JLabel("WEST");
            pnWest.add(lblWest);
            lblWest.setFont(font);
            pnWest.setBackground(Color.PINK);
            pnBorder.add(pnWest,BorderLayout.WEST);
        JPanel pnEast = new JPanel();
            JLabel lblEast = new JLabel("EAST");
        pnEast.setLayout(new BoxLayout(pnEast, BoxLayout.X_AXIS));
            lblEast.setFont(font);
            pnEast.add(lblEast);
            pnEast.setBackground(Color.PINK);
            pnBorder.add(pnEast,BorderLayout.EAST);
        JPanel pnCenter = new JPanel();
            JLabel lblCenter = new JLabel("CENTER");
            lblCenter.setFont(font);
            pnCenter.add(lblCenter);
            pnBorder.add(pnCenter,BorderLayout.CENTER);
        add(pnBorder);
    }

    public static void main(String[] args) {
        new Bai_4("Bai_4");
    }
}
