public class PasarPorReferencia {
    public static void main(String[] args) {
        
        int[] edad = {10,11,12}; // pasar por valor siempre es en primitivo jamas por referencia
        // la clase integer, double son inmutables y cuando se modifica el valor se retorna nueva instancia
        System.out.println("Iniciamos el metodo main");
        for(int i = 0; i<edad.length;i++){
            System.out.println("edad[i] = "+edad[i]);
        }
        System.out.println("Antes de llamar el metodo test");
        test(edad); // aqui se llama el metodo
        System.out.println("Despues de llamar el metodo test");
        for(int i = 0; i<edad.length;i++){
            System.out.println("edad[i] = "+edad[i]);
        }

        System.out.println("finaliza el metodo main con los datos del arreglo modificado!");
    }
    public static void test (int[] edadArr){ // asi se pasa por valor
        System.out.println("iniciamos el metodo test = ");
        for(int i =0; i< edadArr.length;i++){
            System.out.println("edadArr[i] = " + edadArr[i]);
            edadArr[i] = edadArr[i]+20;
        }
        System.out.println("Finaliza el metodo test");
    }
}
