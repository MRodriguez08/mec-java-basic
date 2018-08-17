package rockola.rev_20180723;
import java.util.Scanner;

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

                limpiarPantalla();

                // Imprimir en pantalla

                llamarBanner();

                // Defino las variables string y llamo al Login

                boolean loginOk = llamarLogin();

                if (loginOk == true) { 
                    String accionUsuario = "";
    
                    do {
    
                            accionUsuario = sc.next();
    
                            accionUsuario = accionUsuario.toLowerCase();
    
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
                                    llamarBanner();
                                    llamarLogin();
                                    break;
    
                            }
                            default: {
                                    System.out.println("Accion Invalida");
                                    sc.nextLine();
                                    limpiarPantalla();
                                    opcionesMenu();
                                    break;
                            }
    
                            }
    
                    } while (!accionUsuario.equals("salir"));
                }
                sc.close();
        }

        private static void limpiarPantalla() {
                for (int i = 0; i < 40; i++) {
                        System.out.println("");
                }
        }

        private static void llamarMenu() {

                System.out.println("######################################################");
                System.out.println("##  ####  ##     ##  #### ## #### ####################");
                System.out.println("## # ## # ## ###### # ### ## #### ####################");
                System.out.println("## ## ### ##    ### ## ## ## #### ####################");
                System.out.println("## ###### ## ###### ### # ## #### ####################");
                System.out.println("## ###### ##     ## ####  ####  ######################");
                System.out.println("######################################################");
                System.out.println(" ");

        }

        private static void opcionesMenu() {

                System.out.println("*Que decea hacer?");
                System.out.println("°Crear");
                System.out.println("°Listar");
                System.out.println("°Modificar");
                System.out.println("°Eliminar");
                System.out.println("°Salir");
        }

        private static void llamarBanner() {

                System.out.println("###############################################################################");
                System.out.println("##################  #######     ####     ##     ##   #####  ###################");
                System.out.println("##################  ######  ###  ## ######### ####  # ####  ###################");
                System.out.println("##################  ######  ###  ## ###   ### ####  ## ###  ###################");
                System.out.println("##################  ######  ###  ## ##### ### ####  ### ##  ###################");
                System.out.println("##################      ###     ####     ##     ##  #####   ###################");
                System.out.println("###############################################################################");
                System.out.println(" ");

        }

        private static boolean llamarLogin() {

                Scanner sc = new Scanner(System.in);

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
                                sc.nextLine();
                                intentos++;
                                System.out.println("Te quedan " + (3 - intentos) + " intentos restantes");
                                System.out.println("Usuario y / o contraseña incorrecta, verifique BLOQ Mayuscula");
                                sc.nextLine();
                                limpiarPantalla();

                        }
                        if (intentos > 3) {

                                limpiarPantalla();
                                llamarBanner();
                                System.out.println("Usuario bloquedo llame al 0800-9999 Interno: Pelotudo");
                        }

                }
                if (ingresoOK) {

                        llamarMenu();
                        opcionesMenu();

                }
                return ingresoOK;

        }
}