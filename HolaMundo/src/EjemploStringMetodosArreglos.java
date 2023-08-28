public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {
        
        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.toCharArray() = " + trabalengua.toCharArray()); // convertir el string en arreglo de caracteres
        char[] arreglo = trabalengua.toCharArray(); // retorna un arreglo tipo char
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i =0; i<largo; i++){
            System.out.println(arreglo[i]);
        }
        System.out.println();
        System.out.println("trabalengua.split(\"a\") = " + trabalengua.split("a"));
        String[] arreglo2 = trabalengua.split("a");
        int l = arreglo2.length;
        for (int j = 0; j<l; j++){
            System.out.println(arreglo2[j]);
        }


        String archivo = "alguna.imagen.js";
        char[] arreglo3 = trabalengua.toCharArray();
        String[] archioar = archivo.split("\\."); // es necesario para los puntos y hacer el split 
         l = archivo.length();
        System.out.println("m = " + l);
        for (int j =0 ; j<l;j++){
            System.out.println("archivo = " + archioar[l]);
        }
        System.out.println("extension = "+ archioar[l-1]);
    }
}
