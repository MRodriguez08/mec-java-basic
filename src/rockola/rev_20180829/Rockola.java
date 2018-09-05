package rockola.rev_20180829;

import java.util.ArrayList;
import java.util.Scanner;

public class Rockola {
    
    private static ArrayList<Disco> BARRACUDADISK = new ArrayList<Disco>();

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        //llamo el metodo login con el parametro scanner
        boolean loginOk = login(scanner);
        
        if (loginOk==true) {
            accederMenu(scanner);
        }
        scanner.close();

    }

    private static boolean login(Scanner sc) {
        //defino las variables

        String user = "";
        String passUser = "";
        // pido nombre

        boolean loginOk = false;
        int contador = 0;
        do {

            ImprimoLogin();

            System.out.println("Digite su nombre");
            user = sc.nextLine();
            // pido contraseña
            System.out.println("Digite se contraseña");
            passUser = sc.nextLine();
            // imprimo en pantalla usuario y contraseña
            
            if (user.equals("ANDRES") && passUser.equals("MATHIMBU")) {
                loginOk = true;
            } else {
                contador++;
                System.out.println("Te quedan " + (3 - contador) + " para ingresar.");
            }

        } while (!loginOk && contador < 3);

        if (loginOk == true) {
            System.out.println("Entraste al mundo ROCK - HOLA");
            System.out.println("Eres bienvenido/a");

        } else {
            System.out.println("No reuniste los requisitos para ingresar al maravilloso mundo ROCK-HOLA");

        }
        return loginOk;

    }

    private static void limpiarPantalla() {
        for (int i = 0; i < 40; i++) {
            System.out.println();

        }
    }

    private static void ImprimoLogin() {
        // Imprimo el banner del login
        System.out
                .println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out
                .println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out
                .println("@@@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out
                .println("@@@@@@@@@@@@@@@@@ @ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out
                .println("@@@@@@@@@@@@@@@@ @@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out
                .println("@@@@@@@@@@@@@@@ @@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out
                .println("@@@@@@@@@@@@@@@ @@@@ @@@@@@     @@@@@@@   @@@@@@@  @@@  @@  @@@@   @@@@  @@@@@@@@@@    @@@@");
        System.out
                .println("@@@@@@@@@@@@@@@ @@@ @@@@@@@  @@@ @@@@@ @@@ @@@@  @@@@@  @@ @@@@ @@@ @@@  @@@@@@@@@  @@ @@@@");
        System.out
                .println("@@@@@@@@@@@@@@@ @@@@@@@@@@@  @@ @@@@@  @@@ @@@ @@@@@@@   @@@@@  @@@ @@@  @@@@@@@@  @@@  @@@");
        System.out
                .println("@@@@@@@@@@@@@@@ @@@@@@@@@@@  @  @@@@@  @@@ @@@ @@@@@@@  @@@@@@  @@@ @@@  @@@@@@@        @@@");
        System.out
                .println("@@@@@@@@@       @@@@@@@@@@@  @@@ @@@@@ @@ @@@@@  @@@@@   @@@@@@ @@ @@@@  @@@@@@@  @@@@  @@@");
        System.out
                .println("@@@@@@@        @@@@@@@@@@@@  @@@  @@@@   @@@@@@@   @@@ @@@ @@@@   @@@@@      @@@  @@@@  @@@");
        System.out
                .println("@@@@@@@@@   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out
                .println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out
                .println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

    }
    //1 DO WHILE PARA SEGUIR PREGUNTANDO POR ACCIONES
    private static void accederMenu(Scanner sc ) {

      

        String eleccion;
        //String estilo;

        System.out.println("Elija una de las opciones dijitando el numero correspondiente: ");

        System.out.println("1 - Digita \"CREAR\" para crer un disco");
        System.out.println("2 - Digita \"EDITAR\" para editar un disco");
        System.out.println("3 - Digita \"ELIMINAR\" para eliminar un disco");
        System.out.println("4 - Digita \"SALIR\" para salir");

        eleccion = sc.nextLine();

        switch (eleccion) {
            
            case "LISTAR":
                System.out.println("Listando Discos");
            case "CREAR":
                Crear(sc);
                break;
            case "EDITAR":
                System.out.println("Has elejido editar un disco");
                break;

            case "ELIMINAR":
                System.out.println("Has elejido eliminar un disco");
                break;

            case "SALIR":
                System.out.println("Has elejido salir");
                System.out.println("Chau loco");
                break;

            default:
                System.out.println("Le herraste");
                break;
        }

    }

// 2 PASAR LOS CASOS DEL SWICH A METODOS
 
private static void Crear(Scanner sc) {
    System.out.println("Has elegido crear un disco");
    System.out.println("Digita el género que quieres ingresar");
    System.out.println("1 - \"ROCK\" ");
    System.out.println("2 - \"TECHNO\" ");
    System.out.println("3 - \"RAP\" ");
    System.out.println("4 - \"OLDIES\" ");
    System.out.println("5 - \"SALIR\" para salir");

    //estilo = sc.nextLine();
    String GeneroIngresao = sc.nextLine();
    switch (GeneroIngresao) {
        case "ROCK":
            System.out.println("Creaste un disco en la categoría ROCK");
            break;
        case "TECHNO":
            System.out.println("Creaste un disco en la categoría TECHNO");
            break;
        case "RAP":
            System.out.println("Creaste un disco en la categoría RAP");
            break;
        case "":
            System.out.println("Creaste un disco en la categoría OLDIES");
            break;
    }
   

}
// IMPLEMENTAR EL LISTAR
// IMPLEMENTAR EL DISCO CON LA CLASE DISCO EN EL CREAR

}
