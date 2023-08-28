import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa Detalle de factura");
        System.out.println("Ingrese precio de un producto");
        double producto1 = scanner.nextDouble();
        System.out.println("Ingrese precio de un producto");
        double producto2 = scanner.nextDouble();
        double resultado = producto1+producto2;
        double impuesresul= resultado+25.6082;
        System.out.println("La suma total del producto es de: "+resultado+" Con un impuesto de 25.6082 = "+impuesresul);
    }
}
