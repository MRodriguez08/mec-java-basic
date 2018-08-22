package clases.abms;

import java.util.ArrayList;

import clases.data_transfer_objects.User;

/**
 * Clase de ejemplo para implementar operacion de Creacion y agregado de un
 * elemento a la lista
 * 
 * @author mrodriguez
 *
 */
public class Alta {

    private static final ArrayList<User> USERS = new ArrayList<>();

    public static final void main(String[] args) {

        // cargo la lista
        User user1 = new User();
        user1.setNick("java-mec");
        USERS.add(user1);

        User user2 = new User();
        user2.setNick("anon");
        USERS.add(user2);

        // antes de eliminar
        imprimirUsuarios();

    }

    private static void imprimirUsuarios() {
        for (User user : USERS) {
            System.out.print(user.getNick() + ", ");
        }
        System.out.println();
    }

}
