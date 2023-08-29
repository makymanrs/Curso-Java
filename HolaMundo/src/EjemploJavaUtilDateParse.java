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
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
