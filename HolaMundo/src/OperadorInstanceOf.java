public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = new String("Creando un objeto de la clase String ... que tal!");

        Integer num = 7;

        Boolean b1 = texto instanceof String; // lo que esta en mayuscula como el boolean es referencia
        System.out.println("Texto es del tipo de String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo de Object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("Texto es del tipo de Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("Texto es del tipo de number = " + b1);

        b1 = num instanceof Object;
        System.out.println("Texto es del tipo de Object = " + b1);

        Double decimal = 45.51;
        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo de Number = " + b1);

        b1 = b1 instanceof Boolean;
        b1 = decimal instanceof Number;
        System.out.println("b1 es del tipo de Boolean = " + b1);
        // short u long son numericos que producen entero con distinto tamaño
    }
}
