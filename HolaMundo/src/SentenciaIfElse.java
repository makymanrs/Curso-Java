public class SentenciaIfElse {
    public static void main(String[] args) {
        float promedio = 5.8f;
        if (promedio >= 6.5){
            System.out.println("Felicitaciones excelente promedio ");
            System.out.println();
        }else if(promedio >=6.8) {
            System.out.println("Muy buen promedio!");
        } else if (promedio>=5.5) {
            System.out.println("buen promedio!");
        } else if (promedio>=5.0) {
            System.out.println("regular!, debes esforzarte mas rey");
        } else if (promedio>4.0) {
            System.out.println("insuficiente");
        }else {
            System.out.println("estas reprobado");
        }
        System.out.println("tu promedio es: "+promedio);
    }
}
