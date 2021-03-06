package clases.data_transfer_objects;

import java.io.Serializable;

/**
 * Ejemplo de implementacion de un DTO (Data Data Transfer Object)
 * 
 * @author <a href="mailto:mauricio.rodriguez@globant.com">mauricio.rodriguez</a>
 *
 */
public class User implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public static int contadorUsuarios= 0;

    private String nick = "anon";
    private String email;
    private String password = "S3cUr3d";
    private String name;
    
    public boolean equals(Object o) {
        User usuarioComparado = (User)o;
        // return (nick.equals( usuarioComparado.getNick()));
        
        return nick.equals(usuarioComparado.getNick());
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
