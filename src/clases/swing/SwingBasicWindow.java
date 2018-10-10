package clases.swing;

public class SwingBasicWindow {

    public static Boolean loginOk = false;
    public static String currentUserNick = "";

    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }

}
