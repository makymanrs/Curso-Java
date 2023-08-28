public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String nombre = "Andres".toUpperCase();
        String nombre2 = "Maria".toUpperCase();
        String nombre3 = "Pepe".toUpperCase();

        System.out.print(nombre.charAt(1)+"."+nombre.substring(nombre.length()-2)+"_");
        System.out.print(nombre2.charAt(1)+"."+nombre2.substring(nombre2.length()-2)+"_");
        System.out.print(nombre3.charAt(1)+"."+nombre3.substring(nombre3.length()-2));

    }
}
