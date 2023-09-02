import java.util.Scanner;

public class Seccion5Tarea7 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int cantidadNumeros,numeros = 0,numeromenor = Integer.MAX_VALUE; // el max value me ayuda saber cual es el menor gracias a la condicion 14
        System.out.println("ingrese la cantidad de numeros a imprimir");
        cantidadNumeros = leer.nextInt();
        if(cantidadNumeros<10){
            System.out.println("error se necesita ingresar 10 numeros");
            System.exit(0);
        }

        for (int i=0; i<cantidadNumeros;i++){
            System.out.println("ingrese los numeros");
            numeros=leer.nextInt();

            if(numeros<numeromenor){
                numeromenor=numeros;
            }
        }
        System.out.println("el numero menor es "+ numeromenor);

        if(numeromenor<10){
            System.out.println("el numero menor es menor que 10");
        }else {
            System.out.println("el numero menor es igual o mayor que 10!");
        }
    }
}
