import java.util.Scanner;

public class EstanqueGasolina {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estanque acutal");
        int medidor = s.nextInt();
        if(medidor<=20){
            System.out.println("Insuficiente");
        }
        if (medidor>20 && medidor<=35){
            System.out.println("suficiente");
        }
        if (medidor>35 && medidor<=40){
            System.out.println("Medio tanque");
        }
        if (medidor>40 && medidor<=60){
            System.out.println("Estanque 3/4");
        }
        if (medidor>60 && medidor<70){
            System.out.println("Estanque casi lleno");
        }
        if (medidor==70){
            System.out.println("Estanque lleno");
        }
    }
}
