package clases.abms;

import java.util.ArrayList;

import clases.data_transfer_objects.User;

/**
 * Clase de ejemplo para implementar operacion de Eliminacion de un
 * elemento de la lista
 * 
 * @author mrodriguez
 *
 */
public class Baja {
    
    private static final ArrayList<User> USERS = new ArrayList<>();
    
    public static final void main(String[] args){

        // cargo la lista
        User user1  = new User();
        user1.setNick("java-mec");
        USERS.add(user1);
        
        User user2  = new User();
        user2.setNick("anon");
        USERS.add(user2); 
        
        // antes de eliminar
        imprimirUsuarios();
        
        // busco el usuario "anon"
        User buscado = buscarUsuario("anon");
        if (buscado != null){
            USERS.remove(buscado);
        }
        
        // despues de eliminar
        imprimirUsuarios();
        
    }
    
    private static User buscarUsuario(String nick){
        User usuarioBuscado = null;
        for (User u : USERS){
            if (u.getNick().equals(nick)){
                usuarioBuscado = u;
            }
        }
        return usuarioBuscado;
    }
    
    private static void imprimirUsuarios(){
        for (User user : USERS) {
            System.out.print(user.getNick() + ", ");
        }
        System.out.println();
    }

}
