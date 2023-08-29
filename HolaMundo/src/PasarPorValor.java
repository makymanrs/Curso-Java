public class PasarPorValor {
    public static void main(String[] args) {
        
        int i = 10; // pasar por valor siempre es en primitivo jamas por referencia
        // la clase integer, double son inmutables y cuando se modifica el valor se retorna nueva instancia
        System.out.println("Iniciamos el metodo main con i = " + i);
        test(i); // aqui se llama el metodo
        System.out.println("finaliza el metodo main con el valor de i (se mantiene igual) = " + i);

    }
    public static void test(int i){ // asi se pasa por valor
        System.out.println("iniciamos el metodo test con i = "+i);
        i=35;
        System.out.println("Finaliza el metodo test con i = "+i);
    }
}
