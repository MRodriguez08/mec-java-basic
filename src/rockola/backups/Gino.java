package rockola.backups;
import java.util.Scanner;

public class Gino {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        String usuario = "";
        String contrasenia = "";

        boolean usuarioCorrecto = false;
        int contadorIntentos = 0;
        while ((!usuarioCorrecto) && (contadorIntentos < 3)) {

            usuario = sc.next();
            contrasenia = sc.next();

            /*
             * if (usuario.equals("admin") && contrasenia.equals("admin")) {
             * ingresoOk = true; }
             */
            usuarioCorrecto = (usuario.equals("admin") && contrasenia.equals("admin"));
            if (!usuarioCorrecto) {

                contadorIntentos++;
                System.out.println("Te quedan "+ (3-contadorIntentos ) + " intentos restantes");
            }
        }
        System.out.println(" Entraste a la magistral ROCK - HOLA");
        
        
    
    }

}
