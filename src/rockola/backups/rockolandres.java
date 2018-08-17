package rockola.backups;

import java.util.Scanner;

/**
 * 
 */

/**
 * @author <a href=
 *         "mailto:mauricio.rodriguez@globant.com">mauricio.rodriguez</a>
 *
 */
public class rockolandres {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // imprimo en pantalla el titulo

        System.out.println("8888888888888888888888888888888888");
        System.out.println("88888888888888  Rockola  888888888");
        System.out.println("8888888888888888888888888888888888");

        //defino las variables

        String user = "";
        String passUser = "";
        Scanner sc = new Scanner(System.in);
        // pido nombre

        boolean loginOk = false;
        int contador = 0;
        do {

            System.out.println("Digite su nombre");
            user = sc.nextLine();
            // pido contraseña
            System.out.println("Digite se contraseña");
            passUser = sc.nextLine();
            // imprimo en pantalla usuario y contraseña
            System.out.println("El usuario ingresado es: " + user);
            System.out.println("La contraseña ingresada es: " + passUser);
            if (user.equals("ANDRES") && passUser.equals("MATHIMBU")) {
                loginOk = true;
            } else {
                contador++;
                System.out.println("Te quedan " + (3 - contador) + "para ingresar.");
            }

        } while (!loginOk && contador < 3);

        if (loginOk == true) {
            System.out.println("Entraste al mundo ROCK - HOLA");
            System.out.println("Eres bienvenido/a");

            System.out.println("Si quieres crear un disco dijita 1");
            System.out.println("Si quieres modificar un disco dijita 2");
            System.out.println("Si quieres borrar un disco dijita 3");
            System.out.println("Si quieres salir de este fantástica Rock - HOLA dijita 4");

            int casos = 0;
            switch (casos) {
                case 0:
                    System.out.println("Elejiste salir del programa");
                    break;
                case 1:
                    System.out.println("Elejiste crear un nuevo disco");
                    break;
                case 2:
                    System.out.println("Elejiste modificar un disco");
                    break;
                case 3:
                    System.out.println("elejiste borrar un disco");
                    break;
                default:
                    break;

            }
        } else {
            System.out.println("No reuniste los requisitos para ingresar al maravilloso mundo ROCK - HOLA");
            System.out.println("Shara Connor...            vengo por tí");
        }

    }
}
