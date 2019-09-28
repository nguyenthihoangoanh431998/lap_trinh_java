/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_1;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author N E Z U
 */
public class Jframe_canban extends JFrame {
    public Jframe_canban (){
    setVisible(true);
    setSize (600,200);
    setLocationRelativeTo (null);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bai 1");
    }
   
    public static void main (String [] args) {
        new Jframe_canban();
    }
    
}
