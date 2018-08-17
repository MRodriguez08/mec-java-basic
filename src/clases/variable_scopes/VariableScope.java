package clases.variable_scopes;
import java.util.Scanner;

public class VariableScope {
    
    // variable con alcance de clase!!
    private static Integer enteroAlcanceInstancia = 1;
    private static String usuario = "";
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String sNull;
        
        int myInt = 1;
        
        Integer myInteger = 1;
        
        String str = null;
       
        Character c = null;
        
        if (args != null) {
            
            // variable con alcance de bloque
            Integer enteroBloque = 0;
            System.out.println(enteroBloque);
            
        }
        
        
        Integer enteroAlcanceMetodo = 0;
        System.out.println(enteroAlcanceMetodo);
        
        login();
        
        System.out.println(usuario);
        
        Boolean b1 = true;
        Boolean b2 = null;
        
        String usuario = "";
        
        if(usuario.equals("")) { // NullPointerException
            
        }
        
        Boolean result = b2.equals(b1);
        System.out.println(result);
        
        sc.close();
    }
    
    private static void login() {
        Scanner scanner = new Scanner(System.in);
        
        usuario  = "usuarioIngresado";
        
        scanner.close();
    }
    
    private static void pedirUsuario() {
        
        // blabla bla
    }

}
