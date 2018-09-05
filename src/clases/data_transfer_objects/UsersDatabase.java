package clases.data_transfer_objects;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import clases.data_transfer_objects.User;

/**
 * Uso de DTO User creado con datos de usuario Uso de variable estatica
 * "User.contadorUsuarios" Algoritmo de busqueda usando foreach Uso de lista
 * ArrayList conteniendo objetos del tipo User
 * 
 * @author <a href=
 *         "mailto:mauricio.rodriguez@globant.com">mauricio.rodriguez</a>
 *
 */
public class UsersDatabase {

    private static final String DATABASE_FILE = "c:\\Users\\mauricio.rodriguez\\Desktop\\rockola.db";
    private static ArrayList<User> USERS = new ArrayList<User>();

    public static void main(String[] args) {
        load();
        Scanner scanner = new Scanner(System.in);

        // creamos una instancia de usuario
        User user1 = new User();
        System.out.println("Ingrese su nick:");
        String nick = scanner.next();
        user1.setNick(nick);
        System.out.println("Ingrese su email:");
        user1.setEmail(scanner.next());
        USERS.add(user1);
        user1.contadorUsuarios++;

        // creamos otra instancia de usuario
        User user2 = new User();
        user2.setNick("el-banero");
        USERS.add(user2);
        user2.contadorUsuarios++;

        // creamos una tercera instancia de usuario
        /*User user3 = new User();
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
            if (user.getNick().equals("nickBuscado")) {
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

        boolean existeMejorado = USERS.contains(user3);

        // Algoritmo para recorrer una lista de usuarios e imprimirlos
        System.out.println("Listando usuarios del sistema:");
        for (User user : USERS) {
            System.out.println("······························");
            System.out.println(user.getNick());
            System.out.println(" Email: " + user.getEmail());
        }

        // Uso de variable estatica contadorUsuarios
        System.out.println("Contador Estatico:");
        System.out.println("User.contadorUsuarios = " + User.contadorUsuarios);
        System.out.println("user1.contadorUsuarios = " + user1.contadorUsuarios);
        System.out.println("user2.contadorUsuarios = " + user2.contadorUsuarios);
        */
        
        scanner.close();
        save();
    }

    private static void save() {
        try {
            FileOutputStream fos = new FileOutputStream(DATABASE_FILE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(USERS);
            oos.close();
        } catch (IOException e) {
            USERS = new ArrayList<User>();
        }

    }

    private static void load() {
        try {
            FileInputStream fis = new FileInputStream(DATABASE_FILE);
            ObjectInputStream ois = new ObjectInputStream(fis);
            USERS = (ArrayList<User>) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
