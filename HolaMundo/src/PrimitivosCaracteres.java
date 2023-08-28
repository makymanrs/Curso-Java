public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter "+ (decimal == caracter));

        System.out.println();

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter" + (simbolo==caracter));

        char espacio = ' '; // es un espacio
        char retroceso = '\b'; // borra
        char tabulador = '\t'; // tabulacion
        char nuevalinea = '\n'; // salto de linea
        char retornoCarro = '\r';

        System.out.println("Char corresponde en byte:"+System.lineSeparator()+ retornoCarro + Character.BYTES);
        System.out.println("Char corresponde en bites"+espacio+ Character.SIZE);
        System.out.println("Character.min"+ Character.MIN_VALUE);
        System.out.println("Character.max"+ Character.MAX_VALUE);

    }
}
