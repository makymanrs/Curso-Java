import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1 = scanner.nextInt();
        System.out.println("ingrese un segundo numero");
        int num2 = scanner.nextInt();
        System.out.println("ingrese un tercer numero");
        int num3 = scanner.nextInt();
        System.out.println("ingrese un cuarto numero");
        int num4 = scanner.nextInt();

        max = (num1 > num2)? num1:num2; // el num1 y num2 son el if y else cualquiera de esos datos
        max = (max>num3)? max:num3; // como el max dice si es mayor num1 o num2 por eso se pone max a comparar con num 3 para asi ver si max de la respuesta anterior es max o num 3 como mayor
        max = (max>num4)? max:num4;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("el numero mayor es: "+ max);

    }
}
