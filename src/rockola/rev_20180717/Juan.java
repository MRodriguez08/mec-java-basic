package rockola.rev_20180717;

import java.util.Scanner;

/*
Este programa permite al usuario administrar discos ingresando:
*Nombre del Disco
*Ano del Disco
*Artista

Autor: Juan Andreoli
*/

public class Juan {

       public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
               // Limpiar pantalla
               
               // Imprimo el banner del Logo
               // TODO: estaria bueno tener un metodo "imprimirBanner()" que imprima este cartel, y lo llamas aca
               System.out.println("################################################################################");
               System.out.println("#####   #############         ########       #####  ###  ##########  ###########");
               System.out.println("#####   ############  ######## ##### #############  ###    ########  ###########");
               System.out.println("#####   ###########  ########## ### ##############  ###  #  #######  ###########");
               System.out.println("#####   ###########  ########## ### ##############  ###  ##  ######  ###########");
               System.out.println("#####   ###########  ########## ### ###      #####  ###  ###  #####  ###########");
               System.out.println("#####   ###########  ########## ### ######### ####  ###  ####  ####  ###########");
               System.out.println("#####   ###########  ########## ### ########## ###  ###  #####  ###  ###########");
               System.out.println("#####   ###########  ########## ### ########## ###  ###  ######  ##  ###########");
               System.out.println("#####   ############# ####### ###### ######## ####  ###  #######  #  ###########");
               System.out.println("#####          #######       ########        #####  ###  ########    ###########");
               System.out.println("################################################################################");

               // Definimos las variables
               String usuario = "admin";
               String password = "master";

               // Definimos como poder ingresar al programa + posibilidades de poder
               // ingresar
               boolean loginok = false;

               int contadorIntentos = 0;

               // Hacemos que solicite nuevamene los datos si los datos son incorrectos
               while ((!loginok) && !(contadorIntentos > 3)) {

                       System.out.println("Usuario:");
                       usuario = sc.next();
                       System.out.println("Contrasenia:");
                       password = sc.next();
                       
                       // usuario y contraseñia
                       loginok = (usuario.equals("admin") && password.equals("master"));
                       
                       limpiarpantalla ();
                       
                       // Login, preguntamos que es lo que desea hacer el usuario
                       if (loginok == true) { // TODO: falta indentar todo el cuerpo de este IF
                       System.out.println("Haz ingresado con exito... Que deseas hacer?");
                       System.out.println("Presiona 1 para Listado de Discos...");
                       System.out.println("Presiona 2 para Crear Disco...");
                       System.out.println("Presiona 3 para Modificar Disco...");
                       System.out.println("Presiona 4 para Borrar Disco...");
                       System.out.println("Presiona 5 para Salir...");
                       }
                       // Posibilidades de Intentos
                       else if (!loginok & contadorIntentos < 3){
                               
                       
                               contadorIntentos++;
                               System.out.println("Te quedan " + (3 - contadorIntentos)
                                               + " intentos restantes");
                       }
               
                       else {
                               System.out.println("Error de ingreso");
                               break;
                       }
               }
                       //Creamos las funciones del menú
                       String opcionUsuario;
                       boolean Salir = false;
                       
                       do {
                               opcionUsuario = sc.next();
                               sc.nextLine();
                               //Distintos llamados de opciones del usuario, limpiar pantalla y llamado de menú incluido
                       switch (opcionUsuario){
                       
                               case "1": listardisco ();
                               sc.nextLine();
                               limpiarpantalla();
                               llamarmenu();
                                       break;
                               case "2": creardisco ();
                               sc.nextLine();
                               limpiarpantalla();
                                       break;
                               case "3": modificardisco();
                               sc.nextLine();
                               limpiarpantalla();
                               llamarmenu();
                                       break;
                               case "4": borrardisco();
                               sc.nextLine();
                               limpiarpantalla();
                               llamarmenu();
                                       break;
                                       
                               default:
                                       System.out.println("Elija una Opcion correcta");
                                       
                                       llamarmenu();
                       
                       } 
                       } while (!Salir);
                       //Liberar espacio del escaner
                       sc.close();
               }
               
       private static void listardisco() {
               System.out.println("Listado de discos...");
               System.out.println("Presione enter para continuar...");
       }
               
       private static void creardisco() {
               System.out.println("Crear nuevo disco...");
               System.out.println("Presione enter para continuar...");
       }
       
       private static void modificardisco() {
               System.out.println("Modificar disco...");
               System.out.println("Presione enter para continuar...");
       }
               
       private static void borrardisco () {
               System.out.println("Borrar disco...");
               System.out.println("Presione enter para continuar...");
       }
       
       private static void salirdisco () {
               System.out.println("Saliendo...");
               
       }
       
       private static void llamarmenu() {
               System.out.println("Función completada con exito... Que deseas hacer?");
               System.out.println("Presiona 1 para Listado de Discos...");
               System.out.println("Presiona 2 para Crear Disco...");
               System.out.println("Presiona 3 para Modificar Disco...");
               System.out.println("Presiona 4 para Borrar Disco...");
               System.out.println("Presiona 5 para Salir...");
       }

       private static void limpiarpantalla() {
               for (int i = 0; i < 30; i++) {
                       System.out.println();

               }
       }
}

/**
 * Comentarios:
 * 1) Cuando erro varias veces en usuario y pass me queda esperando que ingrese una opcion y no me dice nada, si pongo "1" me dice listando...
 * 2) Cuando ingreso la opcion estaria bueno que limpie pantalla y me diga "Listado de discos... Presione..." (no esta limpiando)
 * 3) Si ingreso la opcion "2" no me vuelve a mostrar el menu
 * 4) Si ingreso la opcion salir no me deja salir
 */
