package clases.control_structures;
import java.util.Random;
import java.util.Scanner;

/**
 * Programa para definir Estructuras de Control Iterativas de los distintos
 * tipos: * For * While * Do...While
 * 
 * @author <a href=
 *         "mailto:mauricio.rodriguez@globant.com">mauricio.rodriguez</a>
 *
 */
public class EstructurasIterativas {
    
    
    public static final void main(String[] args) {

        System.out.println("ESTRUCTURAS DE CONTROL ITERATIVAS");
        System.out.println("");
        
        for (int i = 0; i < args.length; i++) {
            
        }

        // FOR
        System.out.println("Estructura de control For");
        for (int indiceFor = 0; indiceFor < 10; indiceFor++) {
            System.out.println("Estoy en la iteracion " + indiceFor + "...");
        }
        System.out.println("");

        // WHILE
        System.out.println("Estructura de control While");
        int indiceWhile = 0;
        while (indiceWhile < 10) {

            System.out.println("Estoy en la iteracion " + indiceWhile + "...");
            indiceWhile++;
        }
        System.out.println("");

        //DO..WHILE
        System.out.println("Estructura de control Do..While");
        int indiceDoWhile = 0;
        do {
            System.out.println("Estoy en la iteracion " + indiceDoWhile + "...");
            indiceDoWhile++;
        } while (indiceDoWhile < 10);
        System.out.println("");

        System.out.println("Instruccion break");
        for (int indiceFor = 0; indiceFor < 10; indiceFor++) {
            if (indiceFor == 5) {
                break;
            }
            System.out.println("Estoy en la iteracion " + indiceFor + "...");
        }
        System.out.println("");

        System.out.println("Instruccion continue");
        for (int indiceFor = 0; indiceFor < 10; indiceFor++) {
            if (indiceFor == 5 || indiceFor == 8) {
                continue;
            }
            System.out.println("Estoy en la iteracion " + indiceFor + "...");
        }
        System.out.println("");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Scanner sc =new Scanner(System.in);
        
        String usuario = "";
        String contrasenia = "";
        
        boolean loginOk = false;
        do {
            usuario = sc.next();
            contrasenia = sc.next();
            if (usuario.equals("admin") && contrasenia.equals("admin")) {
                loginOk = true;
            }
        } while (!loginOk);
            
        if (loginOk == true) {
            
            // mostrar opciones
            String opcionUsuario =  "lalala";
            do {
                opcionUsuario = sc.next();
                // switch
                
            } while (!opcionUsuario.equals("salir"));
        } else {
            System.out.println("Usuario no valido");
        }
        
        
        String mensaje = "Usted no esta logueado";
        if (loginOk) {
             mensaje = "Usted esta logueado!!!!";
            
        }
        System.out.println(mensaje);
    }
        
}
