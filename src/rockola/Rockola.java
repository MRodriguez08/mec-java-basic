package rockola;
import java.util.Scanner;

/**
 * Este programa permite al usuario administrar discos ingresando: * Nombre del
 * discos * Año del disco * Artista
 *
 * Autor: mauricio.rodriguez
 */
public class Rockola {

    /* Metodo principal */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // limpiar la pantalla
        limpiarPantalla();

        boolean loginOk = login(sc);

        limpiarPantalla();
        if (loginOk == true) {
            mostrarPantallaPrincipal(sc);
        } else {
            mostrarLoginIncorrecto();
        }

        // limpiar la pantalla al salir
        limpiarPantalla();
        sc.close();
    }
    
    private static void mostrarPantallaPrincipal(Scanner sc) {
     // mostrar opciones
        String opcionUsuario =  "";
        
        boolean esComandoSalir = false;
        do {
            
            //imprimir el menu
            
            System.out.println("Ingrese una opcion:");
            opcionUsuario = sc.next();
                
            if (opcionUsuario.equals("listar")) {
                // llamar a funcion de listar discos
                listarDiscos();
            } else if (opcionUsuario.equals("crear")) {
                // llamar a funcion de crear disco
                creadDisco();
            } else if (opcionUsuario.equals("modificar")) {
                // llamar a funcion de modificar disco
                modificarDisco();
            } else if (opcionUsuario.equals("eliminar")) {
                // llamar a funcion de eliminar disco
                eliminarDisco();
            }
            
            if (opcionUsuario.equalsIgnoreCase("salir") 
                    || opcionUsuario.equalsIgnoreCase("s")){
                System.out.println("Saliendo del  sistema.");
                esComandoSalir = true;
            } else {
                System.out.println("Ha ingresado una opcion incorrecta.. ");
            }
        } while (!esComandoSalir);
    }
    
    private static void mostrarLoginIncorrecto() {
        System.out.println("Usuario no valido");
    }
    
    private static boolean login(Scanner sc) {
        String usuario = "";
        String contrasenia = "";
        boolean loginOk = false;
        do {
            limpiarPantalla();
            // Imprimo el banner del login
            System.out.println("#########################################################");
            System.out.println("####  #######       ####     ###   ###    ######  #######");
            System.out.println("####  #######  ###  ###  #######   ###  ##  ####  #######");
            System.out.println("####  #######  ###  ###  #######   ###  ####  ##  #######");
            System.out.println("####  #######  ###  ###  ###  ##   ###  ######    #######");
            System.out.println("####      ###       ####     ###   ###  ########  #######");
            System.out.println("#########################################################");
            System.out.println("");
         // Pido al usuario nombre
            System.out.println("Usuario:");
            usuario = sc.next();

            // Pido al usuario contraseña
            System.out.println("Password:");
            contrasenia = sc.next();
            if (usuario.equals("admin") && contrasenia.equals("admin")) {
                loginOk = true;
            }
        } while (!loginOk);
        
        return loginOk;
    }
    
    private static void listarDiscos() {
        System.out.println("Listado de discos..");
        System.out.println("Presione enter para continuar...");
        
    }
    
    private static void modificarDisco() {
        System.out.println("Modificar disco..");
        System.out.println("Presione enter para continuar...");
        
    }
    
    private static void eliminarDisco() {
        System.out.println("Eliminar disco..");
        System.out.println("Presione enter para continuar...");
        
    }
    
    private static void creadDisco() {
        System.out.println("Crear nuevo disco..");
        System.out.println("Presione enter para continuar...");
        
    }

    private static void limpiarPantalla() {
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
    }

}