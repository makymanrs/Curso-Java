public class PrimitivosBoolean {
    public static void main(String[] args) {

        boolean datologico = true;
        System.out.println("datologico = " + datologico);

        double d = 98765.43e-3;
        System.out.println("d = " + d);
        float f = 1.2345e2f;
        System.out.println("f = " + f);

        datologico = (d<f);
        System.out.println("datologico = " + datologico);
        
        boolean esIgual = 3-2 ==1;
        System.out.println("esIgual = " + esIgual);
    }
}
