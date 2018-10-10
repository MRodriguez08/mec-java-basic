package clases;

public class Recursion {
    
    public static void main(String[] args) {
        buscarRecursivo("algo");
    }
    
    private static void buscarRecursivo(String buscado) {
        System.out.println("buscando...");
        if (buscado.equals("algo11111")) {
            System.out.println("encontrado!!!");
        } else {
            buscarRecursivo(buscado+="2");
        } 
    }
    
}
