
import java.util.InputMismatchException; // estas son import o dependencias
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
      //  String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;

        try {
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);
        }catch (InputMismatchException e){
            System.out.println("Error debe ingresar un numero entero");
            main(args); // llama el main de metodos la recursividad
            // podemos usar return porque retorna void
            System.exit(0); // todo salio bien
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal) ;

        String resultadoHex = "numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n"+resultadoOctal;
        mensaje += "\n"+resultadoHex;
        System.out.println(mensaje);
    }
}
