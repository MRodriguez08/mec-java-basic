package clases.data_transfer_objects;

public class ClassAndInstance {
    
    private String myAttribute;
    
    public String getMyAttribute() {
        return myAttribute;
    }
    
    public static void myStaticMethod() {
        // do something...
        System.out.println("ejecutando myStaticMethod()...");
        
        
        System.out.println("hecho!!");
    }
    
    public static void main(String[] args) {
        
        
        // llamando el metodo de clase myStaticMethod
        ClassAndInstance.myStaticMethod();
        
        // creacion de una instancia de ClassAndInstance con operador "new"
        ClassAndInstance instanceClassAndInstance = new ClassAndInstance();
        System.out.println(instanceClassAndInstance.getMyAttribute());
    }

}
