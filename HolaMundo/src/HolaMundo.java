public class HolaMundo {
    public static void main(String[] args) {
        
        String saludar = "Hola mundo desde Java"; // String es de referencia igual como Integer
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        
        int numero = 11; // es un primitivo tambien tenemos los short, long y boolean
        System.out.println("numero = " + numero);
        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero = " + numero2);

        var numero3 = "15"; // es un tipo flexible
        
        String nombre;
        nombre = "Andres";
        if(numero>10){
            nombre="Juan";
        }
        System.out.println("nombre = " + nombre);

        int edadPersona = 5;


        // los primitivos estan los boolean [1], char [16],
        // primitiros enteros byte,short,int y long
        // primitivos numeros reales float, double son aquellos que tienen decimales
    }
}
