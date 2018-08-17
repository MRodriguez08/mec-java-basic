package rockola.rev_20180717;

import java.util.Scanner;

public class Hernan {

        public static void main(String[] args) {
                // TODO Apéndice de método generado automáticamente

                // Imprimo el banner del login
            
            // TODO: estaria bueno que crees un metodo para imprimir login (puede ser imprimirLogin()) y lo llames aqui
                System.out.println("######################################################");
                System.out.println("####  ########     #####     ###   ###   ######  #####");
                System.out.println("####  #######  ###  ###  #######   ###  #  ####  #####");
                System.out.println("####  #######  ###  ###  #######   ###  ###  ##  #####");
                System.out.println("####  #######  ###  ###  ###  ##   ###  #####    #####");
                System.out.println("####      ####     #####     ###   ###  #######  #####");
                System.out.println("######################################################");

                Scanner sc = new Scanner(System.in);

                String usuario = "";
                String contrasenia = "";

                boolean ingresoOk = false;
                int contador = 0;
                while ((!ingresoOk) && (contador < 3)) {

                        System.out.println("Ingrese Usuario");
                        usuario = sc.next();
                        System.out.println("Ingrese contrasenia");
                        contrasenia = sc.next();

                        ingresoOk = (usuario.equals("hernan") && contrasenia.equals("hernan"));
                        if (!ingresoOk) {
                                contador++;
                                System.out.println("te quedan " + (3 - contador) + " intentos restantes");
                        } else {
                                System.out.println("Usuario " + usuario + " logueado con exito");
                                System.out.println("Pulse enter para continuar ->");
                                usuario = sc.nextLine();
                                usuario = sc.nextLine();
                                

                        }
                }
                if (ingresoOk == false) {

                        System.out.println("ingreso denegado debido a multiples fallos");
                } else {

                        // limpiarpantalla
                        limpiarPantalla();

                        // Menu
                        String opcionesMenu = "";
                        do {

                                System.out.println("     -------------------------    ");
                                System.out.println("    |          MENU           |   ");
                                System.out.println("    |    Ingrese una Opcion   |   ");
                                System.out.println("    |          Crear          |   ");
                                System.out.println("    |        Modificar        |   ");
                                System.out.println("    |         Eliminar        |   ");
                                System.out.println("    |          Salir          |   ");
                                System.out.println("     -------------------------    ");
                                System.out.println("                 |                ");
                                System.out.println("                 V                ");
                                
                                opcionesMenu = sc.next(); // TODO: estaria bueno que ande para mayusculas y minusculas
                                /* Una pista, para pasar lo que ingreso el usuario a minunscula y olvidarte, asi en los ifs pones en minuscula:
                                 * opcionesMenu = opcionesMenu.toLowerCase();
                                 */
                                // Creado por Hernan
                                if (opcionesMenu.equals("crear")) {
                                        System.out.println("Creando...");
                                        System.out.println("Pulse Enter para continuar...");
                                        sc.nextLine();
                                        sc.nextLine();
                                } else if (opcionesMenu.equals("modificar")) {
                                        System.out.println("Modificando disco");
                                        System.out.println("Pulse enter para continuar...  ");
                                        sc.nextLine();
                                        sc.nextLine();
                                        System.out.println("Pulse Enter para continuar...");
                                } else if (opcionesMenu.equals("eliminar")) {
                                        System.out.println("Eliminando");
                                        System.out.println("Pulse Enter para continuar...");
                                        sc.nextLine();
                                        sc.nextLine();

                                }

                        } while (!opcionesMenu.equals("salir"));
                }
                
                sc.close();
        }

        private static void limpiarPantalla() {
                for (int i = 0; i < 40; i++) {
                        System.out.println();
                }
        }
}

/**
 * Comentarios:
 * 1) Cuando le erro al login estaria bueno que limpie pantalla y me vuelva a mostrar el login
 * 2) Despues que me logueo con exito deberia limpiar pantalla y mostrarme "Usuario hernan logueado con exito, Presione enter..."
 * 3) Cuando ingreso la opcion y doy enter deberia limpiar pantalla y mostrarme "creando... Presione enter.." (por ejemplo)
 */
