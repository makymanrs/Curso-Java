import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        String username = System.getProperty("user.name"); // me dice el nombre de usuario del sistema operativo
        System.out.println("username = " + username);
        
        String home = System.getProperty("user.home"); // ruta de usuario o home
        System.out.println("home = " + home);
        
        String workspace = System.getProperty("user.dir"); // directorio de este proyecto
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version"); // saber version de java
        System.out.println("java = " + java);
        
        String lineSeparator = System.getProperty("line.separator"); // salto de linea se pueden usar ambas
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator  = " + lineSeparator2+" una linea nueva...");

        Properties p = System.getProperties(); // imrpime las propiedades
        p.list(System.out);
    }
}
