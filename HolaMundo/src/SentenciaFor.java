public class SentenciaFor {
    public static void main(String[] args) {
        for (int i= 0 ; i<=10; i++){
            System.out.println("i = " + i);
        }

        for (int i=10; i>=0;i--){
            System.out.println("i = " + i);
        }
        for (int i =1 , j=10; i<j ; i++,j--){
            System.out.println(i+" - "+j);

        }
        for (int i= 0 ; i<=10; i++){ // son numeros pares
            if(i%2==0){ // ! con este caracter se hace impares 
                continue;// no se sale del for sale de la iteracion y continua con la siguiente iteracion
            }
            System.out.println("i = " + i);
        }
    }
}
