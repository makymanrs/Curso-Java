import javax.swing.JOptionPane;

public class NombreMasLargo {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese los nombres completos de tres personas
        String nombreCompleto1 = JOptionPane.showInputDialog("Ingrese el nombre completo de la primera persona:");
        String nombreCompleto2 = JOptionPane.showInputDialog("Ingrese el nombre completo de la segunda persona:");
        String nombreCompleto3 = JOptionPane.showInputDialog("Ingrese el nombre completo de la tercera persona:");

        // Obtener los nombres separados
        String nombre1 = nombreCompleto1.split(" ")[0];
        String nombre2 = nombreCompleto2.split(" ")[0];
        String nombre3 = nombreCompleto3.split(" ")[0];

        // Calcular el nombre más largo
        String nombreMasLargo = "";
        if (nombre1.length() > nombre2.length() && nombre1.length() > nombre3.length()) {
            nombreMasLargo = nombre1;
        } else if (nombre2.length() > nombre3.length()) {
            nombreMasLargo = nombre2;
        } else {
            nombreMasLargo = nombre3;
        }

        // Imprimir el resultado
        JOptionPane.showMessageDialog(null, nombreMasLargo + " tiene el nombre más largo.");
    }
}