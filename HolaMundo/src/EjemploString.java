public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java"); // es un constructor
        boolean esIgual = curso==curso2; // aqui comparan por referencia
        System.out.println("curso==curso2 = " + esIgual);;

        esIgual = curso.equals(curso2); // comparan por valor y ignore case ignora si es maysucula o minuscula
        System.out.println("curso.equals(curso2) = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);



    }
}
