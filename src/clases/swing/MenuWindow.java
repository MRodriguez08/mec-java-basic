package clases.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MenuWindow extends JFrame {
    
    public MenuWindow() {
        // Create and set up the window.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(6,1,4,4));
        panel.setBorder(new EmptyBorder(0, 10, 0, 10));
        
        panel.setBackground(Color.BLACK);
        
        JLabel currentUserLabel = new JLabel("Hola " + SwingBasicWindow.currentUserNick + "!", SwingConstants.RIGHT);
        currentUserLabel.setForeground (Color.RED);
        panel.add(currentUserLabel);

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
                

                LoginForm loginForm = new LoginForm();
                loginForm.setVisible(true);
                
                setVisible(false);
                dispose();
            }
        });
        panel.add(salir);
        
        this.getContentPane().add(panel);

        this.pack();
        this.setSize(300, 300);
    }
    
}
