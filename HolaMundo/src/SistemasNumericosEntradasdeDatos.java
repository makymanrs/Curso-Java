import javax.swing.*;

public class SistemasNumericosEntradasdeDatos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero"); // ventana de dialogo un input
        int numeroDecimal = 0;

        try {
             numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args); // llama el main de metodos la recursividad
            // podemos usar return porque retorna void
            System.exit(0); // todo salio bien
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        System.out.println(resultadoBinario); // convertir a numero binario o nivel de maquina

        int numerobinario = 0b111110100;
        System.out.println("numerobinario = " + numerobinario);

        String resultadoOctal = "numero octal de = " + numerobinario + " = " + Integer.toOctalString(numeroDecimal) ;
        System.out.println(resultadoOctal);
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n"+resultadoOctal;
        mensaje += "\n"+resultadoHex;
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
