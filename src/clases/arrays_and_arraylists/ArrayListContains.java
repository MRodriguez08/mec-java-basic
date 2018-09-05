package clases.arrays_and_arraylists;

import java.util.ArrayList;
import java.util.Scanner;

import clases.data_transfer_objects.User;

public class ArrayListContains {

    private static ArrayList<User> USERS = new ArrayList<User>();

    public static void main(String[] args) {

        // creamos una instancia de usuario
        User user1 = new User();
        user1.setNick("existe");
        USERS.add(user1);
        
        User user2 = new User();
        user2.setNick("KROSTY");
        USERS.add(user2);
        
        User buscado = new User();
        buscado.setNick("no-existe");
        
        if (USERS.contains(buscado))
            USERS.remove(buscado);
        
        if (!USERS.contains(buscado))
            USERS.add(buscado);
        

    }

}
