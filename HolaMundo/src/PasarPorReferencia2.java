class Persona{
    // siempre es recomendar una clase aparte en otra clase java
    private String nombre;
    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre; // tambien se utiliza para hacer referencia que corresponde a un atributo de una clase
    } // toda clase debe ser privada y debe ser modificada por metodos

    public String leerNombre(){
        return this.nombre; // this hace referencia hacia un atributo siempre que no exista variable o argumento que tenga el mismo nombre
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {
        
        Persona persona = new Persona(); // aqui se creo una instancia de persona
        persona.modificarNombre("Andres");



        System.out.println("Iniciamos el metodo main");

        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Antes de llamar el metodo test");
        test(persona); // aqui se llama el metodo
        System.out.println("Despues de llamar el metodo test");

        System.out.println("persona.nombre = " + persona.leerNombre());

        System.out.println("finaliza el metodo main con los datos de la persona modificados!");
    }
    public static void test (Persona persona){ // asi se pasa por valor
        System.out.println("iniciamos el metodo test = ");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el metodo test");
    }
}
