package rockola.rev_20180717;

import java.util.Scanner;

import javax.accessibility.AccessibleBundle;

/*
Este programa permite al usuario administrar discos ingresando:
        *Nombre del disco
        *AÃ±o del disco
        *Artista
Autor:Gino Mena
*/
public class Gino {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Limpiar pantalla

        for (int i = 0; i < 40; i++)// TODO esto es lo mismo que hace el metodo limpiarPantalla(), puedes sacarlo y llamar al metodo
            System.out.println();
        { // TODO estas llaves no estan haciendo nada, 
        }

        // Imprimir en pantalla
        // TODO estaria bueno tener un metodo privado para imprimir banner (imprimirBanner()) que tenga esto
        System.out.println("###############################################################################");
        System.out.println("##################  #######     ####     ##     ##   #####  ###################");
        System.out.println("##################  ######  ###  ## ######### ####  # ####  ###################");
        System.out.println("##################  ######  ###  ## ###   ### ####  ## ###  ###################");
        System.out.println("##################  ######  ###  ## ##### ### ####  ### ##  ###################");
        System.out.println("##################      ###     ####     ##     ##  #####   ###################");
        System.out.println("###############################################################################");
        System.out.println(" ");

        // Defino las variables string

        String usuario = "";
        String password = "";
        String usuarioOK = "admin";
        String passwordOK = "admin";

        boolean ingresoOK = false;

        int intentos = 0;

        while ((!ingresoOK) && !(intentos > 3)) {

            System.out.println("Usuario: ");
            usuario = sc.next();

            System.out.println("Contraseña: ");
            password = sc.next();

            if (usuario.equals(usuarioOK) && (password.equals(passwordOK))) {

                ingresoOK = true;

                limpiarPantalla();

                System.out.println("Usuario Logado correctamente");

            } else {
                intentos++;
                System.out.println("Te quedan " + (3 - intentos) + " intentos restantes");
                System.out.println("Usuario y / o contraseña incorrecta, verifique BLOQ Mayuscula");

            }
            if (intentos > 3) {

                System.out.println("Usuario bloquedo pelotudo");

            }

        }

        if (ingresoOK) {

            System.out.println("######################################################");
            System.out.println("##  ####  ##     ##  #### ## #### ####################");
            System.out.println("## # ## # ## ###### # ### ## #### ####################");
            System.out.println("## ## ### ##    ### ## ## ## #### ####################");
            System.out.println("## ###### ## ###### ### # ## #### ####################");
            System.out.println("## ###### ##     ## ####  ####  ######################");
            System.out.println("######################################################");
            System.out.println(" ");
        }

        // TODO: ten cuidado, esto se va a ejecutar si ingreso OK, y si no tambien!!
        System.out.println("*Que decea hacer?");
        System.out.println("°Crear");
        System.out.println("°Listar");
        System.out.println("°Modificar");
        System.out.println("°Eliminar");
        System.out.println("°Salir");

        String accionUsuario = "";

        do {

            accionUsuario = sc.next();

            accionUsuario = accionUsuario.toLowerCase(); // TODO: esta buenisimo!!

            sc.nextLine();

            limpiarPantalla();

            switch (accionUsuario) {
            case "crear": {
                System.out.println("Creando Disco");
                sc.nextLine();
                limpiarPantalla();
                opcionesMenu();
                break;

            }
            case "listar": {
                System.out.println("Listando Disco");
                sc.nextLine();
                limpiarPantalla();
                opcionesMenu();
                break;
            }
            case "modificar": {
                System.out.println("Modificando Disco");
                sc.nextLine();
                limpiarPantalla();
                opcionesMenu();
                break;
            }
            case "eliminar": {
                System.out.println("Eliminando Disco");
                sc.nextLine();
                limpiarPantalla();
                opcionesMenu();
                break;
            }
            case "salir": {
                System.out.println("Saliendo del Menu");
                sc.nextLine();
                limpiarPantalla();
                opcionesMenu();
                break;

            }
            default: {
                System.out.println("Accion Invalida");
            }

            }

        } while (!accionUsuario.equals("salir"));

        sc.close();
    }

    private static void limpiarPantalla() {
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
    }

    private static void llamarMenu() {// TODO: ya tienes el metodo, te falta llamarlo en la linea 30!!

        System.out.println("######################################################");
        System.out.println("##  ####  ##     ##  #### ## #### ####################");
        System.out.println("## # ## # ## ###### # ### ## #### ####################");
        System.out.println("## ## ### ##    ### ## ## ## #### ####################");
        System.out.println("## ###### ## ###### ### # ## #### ####################");
        System.out.println("## ###### ##     ## ####  ####  ######################");
        System.out.println("######################################################");
        System.out.println(" ");

    }

    private static void opcionesMenu() { // TODO: ya tienes el metodo, te falta llamarlo en la linea 93!!

        System.out.println("*Que decea hacer?");
        System.out.println("°Crear");
        System.out.println("°Listar");
        System.out.println("°Modificar");
        System.out.println("°Eliminar");
        System.out.println("°Salir");
    }
}

/**
 * Comentarios:
 * 1) Arreglar: Cuando corre el programa tengo que hacer un ENTER para que me muestre el login.
 * 2) Cuando erro a la contraseña deberia limpiar pantalla y mostrarme denuevo el login
 * 3) Si excedo el numero de reintentos el programa me muestra las opciones y me muestra "Accion Invalida" (deberia estar dentro de (ingresoOK == true)
 *
 */