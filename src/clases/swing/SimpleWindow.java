package clases.swing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SimpleWindow {
    
    public static void main(String[] args) {
        
        
        JFrame frame = new JFrame("MEC - Curso Java Basico");
        
     // Create and set up the window.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(6,1,4,4));
        panel.setBorder(new EmptyBorder(0, 10, 0, 10));
        
        panel.setBackground(Color.BLACK);
        
        frame.getContentPane().add(panel);
        
        frame.pack();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

}
