package clases.control_structures;
import java.util.Scanner;

/**
 * Programa para definicion de distintos tipos de Estructuras de Control
 * Selectivas:
 *      * Condicional Simple (If...)
 *      * Condicional Doble (If...Else...)
 *      * Condicional Multiple (If...Else If...Else)
 *      * Switch
 * 
 * @author <a href="mailto:mauricio.rodriguez@globant.com">mauricio.rodriguez</a>
 *
 */
public class EstructurasSelectivas {
    
    public static void main(String[] args) {
        
        // defino un scanner para leer entrada de datos por parte de usuario
        Scanner sc = new Scanner(System.in);
        
        String usuario = sc.next();
        boolean loginOk = usuario.equals("admin") ? true : false;
        
        
        
        
        
        if (!usuario.equals("salir")) {
            
        } else {
            if (usuario.equals("S")) {
                loginOk = true;
            } else {
                loginOk = true;
            }
        }
        
        System.out.println(loginOk); 
        /*
        
        System.out.println("Ingrese una accion:");
        String accionUsuario = sc.next();
        
        // condicional simple
        if (accionUsuario.equals("crear")) {
            System.out.println("Creando nuevo disco...");
        }
        
        // condicional doble
        if (accionUsuario.equals("crear")) {
            System.out.println("Creando nuevo disco...");
        } else {
            System.out.println("Accion incorrecta, intente nuevamente.");
        }
        
        // condicional multiple
        if (accionUsuario.equals("crear")) {
            System.out.println("Creando nuevo disco...");
        } else if (accionUsuario.equals("modificar")) {
            System.out.println("Modificando disco...");
        } else {
            System.out.println("Accion incorrecta, intente nuevamente.");
        }
        
        // switch
        switch(accionUsuario) {
            case "crear": {
                System.out.println("miEntero = 1"); 
                break;
            }
            case "eliminar": {
                System.out.println("miEntero = 2"); 
               
            }
            case "listar": {
                System.out.println("miEntero = 2"); 
               
            }
            default: {
                System.out.println("mi entero es distinto de 1 y de 2"); 
            }
            
        }
        
        // definicion de condicionales if e if else "anidados"
        if (accionUsuario.equals("crear")) {
            System.out.println("Creando disco...");
            System.out.println("Procesando.."); 
            System.out.println("Ingrese Nombre:");
            String nombreDisco = sc.next();
            String mayusNombre = nombreDisco.toUpperCase();
            if ( mayusNombre.contains("SEX")) {
                System.out.println(
                    "Ud no puede ingreesar disco con palabra \"sex\"");
            } else {
                System.out.println("Disco " + nombreDisco + " creado con exito!");
            }
        } else {
            System.out.println("Opcion distinta de crear");
        }
        */
        
        
    }

}
