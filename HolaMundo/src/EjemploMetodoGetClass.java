import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola que tal?";

        Class strClass = texto.getClass(); // es un metodo que nos permite obtener informacion de la reflexion del objeto o metada o nombre de la clase completa y package metodos y atributos, constructores clases padres
        System.out.println("strClass.getName() = " + strClass.getName()); // aqui se obtiene la entidad
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName()); // aqui se obiene la variable que se declaro por ejemplo el tipo String
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName()); // obtiene el nombre del package
        System.out.println("strClass = " + strClass); // obtiene el nombre completo y java class

        for (Method method: strClass.getMethods()){
            System.out.println("method.getName() = " + method.getName()); // nos lista todos los metodos de la clase string que son todos y algunos que hemos visto
      // en resumen el get class nos retorna informacion del objeto estructura interna de la clase
        }

        Integer num =34;
        Class intClass = num.getClass();
        Class objClas = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass()); //
        System.out.println("intClass.getSuperclass() = " + objClas ); //

        for (Method method: objClas.getMethods()){
            System.out.println("method.getName() = " + method.getName()); // nos lista todos los metodos de la clase string que son todos y algunos que hemos visto
            // en resumen el get class nos retorna informacion del objeto estructura interna de la clase
        }




    }
}
