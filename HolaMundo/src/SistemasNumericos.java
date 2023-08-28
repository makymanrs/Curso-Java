public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 500 ;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de = " + numeroDecimal+ " = "+ Integer.toBinaryString(numeroDecimal)); // convertir a numero binario o nivel de maquina
        
        int numerobinario = 0b111110100;
        System.out.println("numerobinario = " + numerobinario);

        System.out.println("numero octal de = " + numerobinario+ " = "+ Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de = " + numeroDecimal+ " = " +Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
    }
}
