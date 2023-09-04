import java.io.IOException;

public class EjemploEjecutarSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();  //nos permite ejecutar aplicaciones
        Process proceso;
        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) { // aqui tambien se puede aplicar
                proceso = rt.exec("notepad");
            }else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
                proceso = rt.exec("textedit");
            }else if (System.getProperty("os.name").toLowerCase().contains("nux")) {
                proceso = rt.exec("textedit");
            }else if (System.getProperty("os.name").toLowerCase().contains("nix")) {
                proceso = rt.exec("textedit");
            }
            else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        }catch (Exception e) {
                System.err.println("El comando es desconocido: "+e.getMessage());
                System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
