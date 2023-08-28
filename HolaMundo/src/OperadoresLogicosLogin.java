import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
 /*
        String [] usernames = new String[3]; // asi se ponen arreglos con strings
        String [] passwords = new String[3];

        usernames[0] = "maky";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345"; */

        String [] usernames = {"andres","admin","pepe"}; // asi se ponen arreglos con strings
        String [] passwords =  {"123","1234","12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese la contraseña");
        String contrasena = scanner.nextLine();

        boolean esAutenticado = false;

        for(int i = 0; i<usernames.length; i++){ // con el i se itera la cantidad de elementos por eso el lenght para que cuente las posiciones
            if( (usernames[i].equals(usuario) && passwords[i].equals(contrasena))){ // en este caso se utiliza un equals ya que es un string
                esAutenticado = true;
                break;
            }
        }
        if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(usuario).concat("!"));
        }else {
            System.out.println("Username o contraseña son incorrectos");
            System.out.println("Lo siento, requiere autenticacion");
        }

    }
}
