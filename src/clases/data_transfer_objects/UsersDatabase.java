package clases.data_transfer_objects;

import java.util.ArrayList;
import java.util.Scanner;

import clases.data_transfer_objects.User;

/**
 * Uso de DTO User creado con datos de usuario
 * Uso de variable estatica "User.contadorUsuarios"
 * Algoritmo de busqueda usando foreach
 * Uso de lista ArrayList conteniendo objetos del tipo User
 * 
 * @author <a href="mailto:mauricio.rodriguez@globant.com">mauricio.rodriguez</a>
 *
 */
public class UsersDatabase {
    
    private static ArrayList<User> USERS = new ArrayList<User>();
    
    public static void main(String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // creamos una instancia de usuario
        User user1  = new User();
        System.out.println(user1.getNick());
        user1.setNick("java-mec");
        System.out.println(user1.getNick());
        USERS.add(user1);
        user1.contadorUsuarios++;
        
        // creamos otra instancia de usuario
        User user2  = new User();
        user2.setNick("el-banero");
        USERS.add(user2);
        user2.contadorUsuarios++;

        // creamos una tercera instancia de usuario
        User user3  = new User();
        user3.setNick("el-banero");
        
        // Algoritmo para modificar
        User usuarioAActualizar = null;
        for (User user : USERS) {
            if (user.getNick().equals(user3.getNick())) {
                usuarioAActualizar = user;
            }
        }
        // ahora actualizo el usuario
        usuarioAActualizar.setEmail("email_modificado@mec.com");
        usuarioAActualizar.setName("nombre modificado");
        usuarioAActualizar.setNick("nick modificado");
        usuarioAActualizar.setPassword("password modificada");
        
        // Algoritmo para chequear si existe un usuario
        boolean existe = false;
        for (User user : USERS) {
            if (user.getNick().equals(user3.getNick())) {
                existe = true;
            }
        }
        if (existe) {
            System.err.println("El usuario " + user3.getNick() + " ya existe..");
        } else {
            // Si el usuario a agregar no existe... lo agrego
            USERS.add(user3);
            user3.contadorUsuarios++;
        }
        
        // Algoritmo para recorrer una lista de usuarios e imprimirlos
        System.out.println("Listando usuarios del sistema:");
        for (User user :  USERS) {
            System.out.println("······························");
            System.out.println(user.getNick());
            System.out.println(" Email: " + user.getEmail());
        }
        
        // Uso de variable estatica contadorUsuarios
        System.out.println("Contador Estatico:");
        System.out.println("User.contadorUsuarios = " + User.contadorUsuarios);
        System.out.println("user1.contadorUsuarios = " + user1.contadorUsuarios);
        System.out.println("user2.contadorUsuarios = " + user2.contadorUsuarios);
        
        scanner.close();
    }

}
