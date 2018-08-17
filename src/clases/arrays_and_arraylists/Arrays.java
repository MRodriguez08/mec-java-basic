package clases.arrays_and_arraylists;

/**
 * Arrays de elementos en JAVA
 * 
 * @author <a href="mailto:mau.rod.81090@gmail.com">mauricio.rodriguez</a>
 */
public class Arrays {
    
    public static void main(String[] args) {
        
        // Declaracion de un array de Strings
        System.out.println("Declarando variables...");
        String[] myStringArray;
        String myOtherStringArray[];
        
        // Inicializacion del array 
        System.out.println("Instanciando arreglo de tamaño 3...");
        myStringArray = new String[3];
        
        // Inicializacion del array
        System.out.println("Instanciando arreglo con valores iniciales...");
        myOtherStringArray = new String[] {"String_1", "String_2", "String_3"};
        
        // Acceder a un elemento
        System.out.println("Acceder a un elemento del array...");
        System.out.println("myOtherStringArray[0] = " + myOtherStringArray[0]);
        System.out.println("myOtherStringArray.length = " + myOtherStringArray.length);
        // System.out.println(myOtherStringArray[3]); // Error: java.lang.ArrayIndexOutOfBoundsException
        
        // Recorrer un array con estructura for
        System.out.println("Imprimiendo myOtherStringArray...");
        for (int idx = 0; idx < myOtherStringArray.length; idx++) {
            System.out.println("posicion " + idx + " -> " + myOtherStringArray[idx]);
        }
        
        // Recorrer un array con estructura foreach
        System.out.println("Imprimiendo myStringArray...");
        for (String string : myStringArray) {
            System.out.println(string);
        }
        
    }

}
