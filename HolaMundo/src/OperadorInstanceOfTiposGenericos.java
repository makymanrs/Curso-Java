public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String ... que tal!";

        Integer num = Integer.valueOf(7);//7; // retorna el objetio del tipo integer y se asocia a integer num o number

        Boolean b1 = texto instanceof String; // lo que esta en mayuscula como el boolean es referencia

        System.out.println("Texto es del tipo de String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo de Object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("Texto es del tipo de Integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("Texto es del tipo de Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("Texto es del tipo de number = " + b1);

        b1 = num instanceof Object;
        System.out.println("Texto es del tipo de Object = " + b1);

        //b1 = num instanceof Long; // numero esta asociado a Number a generico como referencia
        System.out.println("num es del tipo de Long = " + b1);

       // b1 = num instanceof Double;
        System.out.println("num es del tipo de Double = " + b1);

        Number decimal = Float.valueOf(45.54f);
        b1= decimal instanceof Double;
        System.out.println("decimal es del tipo de Double = " + b1);

        b1= decimal instanceof Integer;
        System.out.println("decimal es del tipo de Integer = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo de Number = " + b1);

        b1 = b1 instanceof Boolean;
        b1 = decimal instanceof Number;
        System.out.println("b1 es del tipo de Boolean = " + b1);
        // short u long son numericos que producen entero con distinto tamaño
    }
}
