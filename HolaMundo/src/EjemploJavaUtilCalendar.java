import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();     // esto es una clase abstaracta con el operador new
        // esto crea el calendario de manera estatica
        // calendario.set(2023,Calendar.SEPTEMBER,21,13,40,20); // nos permite indicar una fecha en especifico. se imparte año/mes/dia
        // esta es otra forma de colocar las fechas linea por linea
        calendario.set(Calendar.YEAR,2023);
        calendario.set(Calendar.MONTH,Calendar.SEPTEMBER);
        calendario.set(Calendar.DAY_OF_MONTH,21);
        calendario.set(Calendar.HOUR, 2);
        calendario.set(Calendar.AM_PM,Calendar.PM);
      //  calendario.set(Calendar.HOUR_OF_DAY, 12);
        calendario.set(Calendar.MINUTE,20);
        calendario.set(Calendar.SECOND,10);
        calendario.set(Calendar.MILLISECOND,125);

        Date fecha = calendario.getTime(); // reotrna un date de java util
        System.out.println("fecha sin formato = " + fecha);

        // reseteamos la fecha pero con formato
        // esta opcion sale mas facil que la anterior
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
        String fechaconFormato = formato.format(fecha);
        System.out.println("fecha con Formato = " + fechaconFormato);
    }
}
