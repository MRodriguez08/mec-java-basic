package clases.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class SwingBasicWindow {
    
    public static void main(String[] args) {
      //Create and set up the window.
        JFrame frame = new JFrame("MEC - Curso Java Basico");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(5,1,4,4));
        panel.setBorder(new EmptyBorder(0, 10, 0, 10));
        
        panel.setBackground(Color.BLACK);

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Rockola", SwingConstants.CENTER);
        Font titleFont = new Font("Serif", Font.PLAIN, 24);
        label.setFont(titleFont);
        label.setForeground (Color.WHITE);
        
        panel.add(label);
        
        JButton listarDiscos = new JButton("Listar Discos");
        panel.add(listarDiscos);
        
        JButton crearDisco = new JButton("Crear Disco");
        panel.add(crearDisco);
        
        JButton modificarDisco = new JButton("Modificar Disco");
        panel.add(modificarDisco);
        
        JButton salir = new JButton("Salir");
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose();
            }
        });
        panel.add(salir);
        
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

}
