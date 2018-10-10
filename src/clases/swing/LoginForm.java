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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LoginForm extends JFrame {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    public LoginForm() {
        // Create and set up the window.
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new GridLayout(8, 1));
        panel.setBorder(new EmptyBorder(0, 10, 0, 10));
        
        panel.setBackground(Color.BLACK);

        JLabel label = new JLabel("Rockola", SwingConstants.CENTER);
        Font titleFont = new Font("Serif", Font.PLAIN, 24);
        label.setFont(titleFont);
        label.setForeground (Color.WHITE);
        
        panel.add(label);
        
        JLabel messageLabel = new JLabel("", SwingConstants.LEFT);
        messageLabel.setForeground (Color.RED);
        panel.add(messageLabel);
        
        JLabel userLabel = new JLabel("Usuario", SwingConstants.LEFT);
        userLabel.setForeground (Color.WHITE);
        panel.add(userLabel);
        
        JTextField userInput = new JTextField("");
        panel.add(userInput);
        
        JLabel passwordLabel = new JLabel("Contraseña", SwingConstants.LEFT);
        passwordLabel.setForeground (Color.WHITE);
        
        panel.add(passwordLabel);
        
        JPasswordField passwordInput = new JPasswordField("");
        panel.add(passwordInput);
        
        JButton salir = new JButton("Ingresar");
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userInput.getText().equals("admin") && passwordInput.getText().equals("admin")) {
                    messageLabel.setText("LOGIN CORRECTO! REDIRIGIENDO A MENU EN " + 1);
                    SwingBasicWindow.loginOk = true;
                    SwingBasicWindow.currentUserNick = userInput.getText();
                    
                    MenuWindow menuWindow = new MenuWindow();
                    menuWindow.setVisible(true);
                    
                    dispose();
                    setVisible(false);
                } else {
                    messageLabel.setText("LOGIN INCORRECTO... REINTENTE NUEVAMENTE.");
                }
            }
        });
        panel.add(salir);
        
        this.getContentPane().add(panel);

        this.pack();
        this.setSize(300, 400);
    }

}
