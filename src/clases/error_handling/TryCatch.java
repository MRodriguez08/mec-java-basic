package clases.error_handling;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Manejo de errores
 * 
 * @author <a href="mailto:mauricio.rodriguez@globant.com">mauricio.rodriguez</a>
 *
 */
public class TryCatch {
    
    public static void main(String[] args) {
        
        try {
            
            float f = 1 / 0;
            
            metodoConError();
            
            // abro conexion a base de datos
            
            //guardaban datos
            
            // cierro conexion
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, 
                    "El scanner no ha sido inicializado( " + e.getMessage() + ")");
            System.out.println("El scanner no ha sido inicializado");
        
        } finally {
           // se ejecuta siempre!! 
        }
        
    }

    private static void metodoConError() throws Exception {
        Scanner scanner = null;
        
        String usuario = scanner.next();
        
        scanner.close();
    }

}
