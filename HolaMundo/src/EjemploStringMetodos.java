public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Andres";

        System.out.println("nombre = " + nombre.length()); // te muestra la cantidad de caracteres que tiene
        System.out.println("Convertir en mayusucla ="+ nombre.toUpperCase());
        System.out.println("Convertir en minuscula ="+ nombre.toLowerCase());
        System.out.println("Comparar nombre = "+nombre.equals("Andres"));
        System.out.println("Nombre.equals = "+ nombre.equalsIgnoreCase("andres")); // este equals ignora si esta mayuscula o minuscula
        System.out.println("nombre.compareTo = " + nombre.compareTo("Andres")); // compara esto a orden alfabetico y orden segun orden lexico grafico
        System.out.println("Nombre.comparteTo(Aaron) = "+ nombre.compareTo("Aaron"));
        System.out.println("nombre.charat = "+nombre.charAt(2)); // convertir un string en caracteres en base a los elementos de posicion
        System.out.println("Nombre.charat ultimo caracter = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.sub = "+ nombre.substring(1)); // busca extraer caracteres en este caso si pones 1 toma la 1 de primero
        System.out.println("nombre.substring (1,4) = "+ nombre.substring(1,4));
        System.out.println("nombre.substring (4,6) = "+ nombre.substring(4,6));
        System.out.println("Nombre.substring(nombre.length()-1 = " +nombre.substring(nombre.length()-1));
        
        String trabalengua = "trabalenguas";
        System.out.println("trabalengua = " + trabalengua.replace("a","."));
        System.out.println("trabalengua = " + trabalengua);
        System.out.println("index = "+ trabalengua.indexOf('a')); // permite saber si se encuentra un caracter dentro de un string
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));
        System.out.println("trabalengua.indexOf('z') = " + trabalengua.indexOf('z'));
        System.out.println("trabalengua.contains(\"t\") = " + trabalengua.contains("t")); // retorna un true o false si contiene el dato en el string
        System.out.println("trabalengua.contains(\"t\") = " + trabalengua.contains("z"));
        System.out.println("trabalengua.contains(\"t\") = " + trabalengua.contains("lenguas"));
        System.out.println("trabalengua.startsWith() = " + trabalengua.startsWith("t")); // Si comienza con y muestra true o false
        System.out.println("trabalengua endswith() = "+ trabalengua.endsWith("s"));
        System.out.println("  trabalengua " );
        System.out.println("  trabalengua ".trim()); // elimina los espacios y puede ayudar con espacios como logins o sitios web
    }
}
