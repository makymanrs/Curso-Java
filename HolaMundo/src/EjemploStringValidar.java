import java.util.Locale;

public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;
        boolean esNulo = curso==null;
        System.out.println("esNulo = " + esNulo);
        if(curso == null){
            curso = "";
        }
        // solo usamos el concat cuando tiene instancai y no es nulo
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);
        
        boolean esVacio2 = curso.isEmpty(); // es otra forma si es null o vacio
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank(); // otra forma de saber si es blanco los espacios y es la forma mas segura y estricta para ver si tiene espacios en blanco
        System.out.println("esBlanco = " + esBlanco);

        if(esBlanco == false){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }


    }
}
