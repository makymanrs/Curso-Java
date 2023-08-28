public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andres Guzman";

        String resultado = curso.concat(profesor); // curso.concat(profesor); si se pone de esta manera no concatena como deberia ser con curso y programador unidos
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso==resultado);

        String resultado2 = curso.transform(c->{ // otra forma de concatenar con formas lambda
            return c + " con " + profesor;
        });
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a","A");
        System.out.println("resultado3 = " + resultado3); // es necesario guardar con otra variable
    }
}
