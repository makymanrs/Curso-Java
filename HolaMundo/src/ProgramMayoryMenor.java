import java.util.Scanner;

public class ProgramMayoryMenor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] datos = new int[4];
        System.out.println("Ingrese un numero");
        datos[0]= s.nextInt();
        System.out.println("Ingrese un numero");
        datos[1]= s.nextInt();

            datos[2] = (datos[0]>datos[1])? datos[0]:datos[1];
            datos[3] = (datos[0]<datos[1])? datos[0]:datos[1];
        System.out.println("el numero mayor es: "+datos[2]);
        System.out.println("el numero menor es: " + datos[3]);

    }
}

  /*  Pedir dos números y mostrarlos ordenados de mayor a menor

    El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.

        Podría ser utilizando operador ternario.

        Preguntas de esta tarea
        Publique aquí su código del requerimiento de la tarea, no sin antes haberlo probado en su IDE.

   */