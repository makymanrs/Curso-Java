public class SentenciaBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int maxpalabra = palabra.length();
        int maxfrase = frase.length() - maxpalabra;

        int cantidad =0;
        char letra = 'g';
        buscar:
        for(int i =0; i<=maxfrase;i++){
            int k = i;
            for (int j=0;j<maxpalabra;j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad+ " veces la palabra "+palabra+" en la frase");
    }
}
