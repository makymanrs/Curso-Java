import java.util.Scanner;
public class Seccion5Tarea8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumaNotasMayoresA5 = 0;
        double sumaNotasMenoresA4 = 0;
        int cantidadNotasIgualesA1 = 0;
        int totalNotas = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese la nota del alumno " + i + " (1 a 7, 0 para salir): ");
            double nota = scanner.nextDouble();

            if (nota == 0) {
                System.out.println("Saliendo del programa debido a una nota igual a 0.");
                break;
            }

            if (nota >= 1 && nota <= 7) {
                totalNotas++;

                if (nota > 5) {
                    sumaNotasMayoresA5 += nota;
                } else if (nota < 4) {
                    sumaNotasMenoresA4 += nota;
                }

                if (nota == 1) {
                    cantidadNotasIgualesA1++;
                }
            } else {
                System.out.println("La nota ingresada no está en el rango válido (1 a 7).");
                i--; // Restamos 1 al contador para repetir la entrada de la misma nota.
            }
        }

        if (totalNotas > 0) {
            double promedioNotasMayoresA5 = sumaNotasMayoresA5 / totalNotas;
            double promedioNotasMenoresA4 = sumaNotasMenoresA4 / totalNotas;
            double promedioTotal = (sumaNotasMayoresA5 + sumaNotasMenoresA4) / totalNotas;

            System.out.println("Promedio de notas mayores a 5: " + promedioNotasMayoresA5);
            System.out.println("Promedio de notas menores a 4: " + promedioNotasMenoresA4);
            System.out.println("Cantidad de notas iguales a 1: " + cantidadNotasIgualesA1);
            System.out.println("Promedio total: " + promedioTotal);
        } else {
            System.out.println("No se ingresaron notas válidas.");
        }

        scanner.close();
    }
}
