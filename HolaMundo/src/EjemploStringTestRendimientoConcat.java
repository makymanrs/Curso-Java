public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a); // este es mutable con los elementos
        long inicio = System.currentTimeMillis(); // toma el tiempo en milisieguntos


        for (int i = 0; i <10000; i++){
            // aqui hay tres manera de probar
           // c = c.concat(a).concat(b).concat("\n");
           // c+=a+b+"\n";
            sb.append(a).append(b).append("\n"); // este es mas optimizado en concatenar con string


        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " +sb.toString());

    }
}
