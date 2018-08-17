package clases.java_operators;

public class Operadores {

    public static void main(String[] args) {
        System.out.println("Operadores en java"); 
        
        System.out.println();
        
        System.out.println("Operadores aritmeticos");
        Integer i = 0;
        Integer z = i + 10;
        Integer y = i - 10;
        System.out.println("z = " + z);
        System.out.println("y = " + y);
        
        System.out.println();
        
        System.out.println("Operadores relacionales");
        System.out.println("z > y -> " + (z > y) );
        System.out.println("z != y -> " + (z != y) );
        
        System.out.println();
        
        System.out.println("Operadores logicos");
        Boolean b1 = (z > y) && (z != y);
        Boolean b2 = (z > y) || (z != y);
        System.out.println("b1 -> " + b1 );
        System.out.println("b2 -> " + b2 );

        System.out.println("Operadores unitarios");
        System.out.println("++z -> " + ++z );
        System.out.println("z++ -> " + z++ );
        System.out.println("z -> " + z );
        System.out.println("!b1 -> " + !b1 );
        
        System.out.println("Operadores de asignacion");
        int h = 5;
        System.out.println("h -> " + h );
        h += 5;
        System.out.println("h+=5 -> " + h );
        h *= 10;
        System.out.println("h *= 10 -> " + b2 );
        
        System.out.println();
        
        System.out.println("Operador condicional");
        String conditional = h % 2 == 0 ? "h % 2 == 0 -> true" : "h % 2 == 0 -> false";
        String mensajeLogin = login() ? "Ingresado con exito!" : "Error en login";
        Boolean j = h % 2 == 0 ? true : false;
        System.out.println(mensajeLogin);
        
    }
    
    private static boolean login() {
        return true;
    }

}
