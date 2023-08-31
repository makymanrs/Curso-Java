import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {

    public static void main(String[] args) {

        // esto ayudara para la tarea de edad :)
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'");
        try {
            Date fecha = format.parse(s.next()); // si ponemos este formato 2023/08/29 es incorrecto
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date();

            if(fecha.after(fecha2)){
                System.out.println("Fecha1 del usuario es despues que fecha fecha2 actual");
            }else if(fecha.before(fecha2)){
                System.out.println("fecha1 es anterior que fecha2 ");
            }else if(fecha.equals(fecha2)){
                System.out.println("fecha 1 es igual a fecha 2");
            }
            if(fecha.compareTo(fecha2) >0){
                System.out.println("Fecha1 del usuario es despues que fecha fecha2 actual");
            }else if(fecha.compareTo(fecha2)<0){
                System.out.println("fecha1 es anterior que fecha2 ");
            }else if(fecha.compareTo(fecha2)==0){
                System.out.println("fecha 1 es igual a fecha 2");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
