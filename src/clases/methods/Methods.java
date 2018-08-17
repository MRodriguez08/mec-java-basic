package clases.methods;
import java.util.Scanner;

public class Methods {

 /* acceso        ret  Nombre  parametros  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        imprimirMenu();
        
        boolean loginok = login(scanner);
        
        if (loginok) {
            
            // mostrar menu
            
            String nombreDisco = scanner.next();
            Integer anio = scanner.nextInt();
            String artista = scanner.next();
            Long duracion = scanner.nextLong();
            System.out.println(ingresarDisco(artista, anio, nombreDisco, duracion));
        } else {
            // mostrar mensaje de error
        }
        
        scanner.close();
    }
    
    /**
     * Metodo sin retorno y sin parametros
     */
    private static void imprimirMenu() {
        System.out.println("menu...");   
    }
    
    /**
     * Metodo con parametro Scanner y retorno boolean
     * @param sc Scanner
     * @return booleano
     */
    private static boolean login(Scanner sc) {
        
        String usuario = sc.next();
        String contrasenia = sc.next();
        
        boolean loginOk = usuario.equals("admin") && contrasenia.equals("admin");
        if (loginOk) {
            System.out.println("exito!!");
        } else {
            System.out.println("fallido!!");
        }
        return loginOk;
    }
    
    private static String ingresarDisco(String nombre, Integer anio, String artista,
            Long duracion) {
        
        System.out.println("Creando disco..");
        System.out.println("nombre: " + nombre);
        System.out.println("año: " + anio);
        System.out.println("artista: " + artista);
        System.out.println("duracion: " + duracion);
        
        return "Disco ingresado con exito!";
    }

}
