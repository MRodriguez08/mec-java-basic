package clases.arrays_and_arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    
    private static ArrayList<String> ROCKOLA_DISCS_DATABASE = new ArrayList<String>();
    
    public static void main(String[] args) {
        
        ArrayList myArrayList = new ArrayList();
        
        myArrayList.add("Lenguaje");
        myArrayList.add(3);
        myArrayList.add('a');
        myArrayList.add(23.5);
        
        //Los elementos del arrayList a son:
        //  “Lenguaje”  2  ‘a’   23.5
        
        // Recorrer los elementos de un ArrayList
        for (Object object : myArrayList) {
            System.out.println(object);
        }
        
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("JAVA");
        stringArrayList.add("Hola");
        stringArrayList.add("Mundo");
        
        // Recorrer los elementos de un ArrayList
        for (String object : stringArrayList) {
            System.out.println(object);
        }
        
        System.out.println("Size: " + stringArrayList.size());

        // elimino algunos elementos
        stringArrayList.remove("Hola");
        stringArrayList.remove("Mundo");
        
        System.out.println("Despues de eliminar Mundo");
        for (String object : stringArrayList) {
            System.out.println(object);
        }

        // agrego otros elementos
        stringArrayList.add("Hello");
        stringArrayList.add("Wolrd!");
        
        
        // Recorrer un arrayList
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }
        
        for (String str : stringArrayList) {
            System.out.println(str);
        }
        
        // Recorrer un arrayList
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }
        
        int idx = 0;
        while (idx < stringArrayList.size()) {
            System.out.println(stringArrayList.get(idx));
        }
        
        for (String str : stringArrayList) {
            System.out.println(str);
        }
        
    }
    
    private static void crear(Scanner sc) {
        System.out.println("Ingrese el nombre del nuevo disco");
        
        String nombreDisco = sc.next();
        
        // chequear que el nombre del disco no existe..
        
        // si existe muestro error 
        
        // si no existe lo agrego...
        ROCKOLA_DISCS_DATABASE.add(nombreDisco);
        
    }
    
    private static void listar() {
        for (String nombreDisco : ROCKOLA_DISCS_DATABASE) {
            System.out.println(" * " + nombreDisco);
        }
    }
    

}
