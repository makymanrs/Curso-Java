import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes entre el 1 - 12");
        int mes = s.nextInt();
        String nombreMes = null;
        switch (mes){
            case 1:
                nombreMes = "enero";
                break;
            case 2:
                nombreMes = "febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";
        }
        System.out.println("nombreMes = " + nombreMes);


        char num = 'd';
        switch (num){
            case '0':
                System.out.println("el num es cero");
                break;
            case '1':
                System.out.println("el num es uno");
                break;
            case '2':
                System.out.println("el num es dos");
                break;
            case '3':
                System.out.println("el num es tres");
                break;
            case '4':
                System.out.println("el num es cuatro");
                break;
            default:
                System.out.println("numero o caracter desconocido");
        }

        String nombre = "andres";

        switch (nombre){
            case "admin":
                System.out.println("hola admin bienvenido");
                break;
            case "andres":
                System.out.println("hola bienvenido");
                break;
            case "pepe":
                System.out.println("hola pepe");
                break;
            default:
                System.out.println("usuario desconocido");
        }
    }
}
