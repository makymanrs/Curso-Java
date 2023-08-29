import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        
        // java date es para trabajar con fechas, estandar en lenguaje java y el otro es para base de datos
        Date fecha = new Date(); // instancia de fecha

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
        String fechaStr = df.format(fecha); // este metodo recibe el objeto date de la fecha

        long j = 0;
        for(int i = 0; i<10000000; i++){
            j +=i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempofinal = fecha2.getTime() - fecha.getTime(); // retorna los milisegundos
        System.out.println("Tiempo transcurrido en el for = " + tiempofinal);
        System.out.println("fechaStr = " + fechaStr);

    }
}
