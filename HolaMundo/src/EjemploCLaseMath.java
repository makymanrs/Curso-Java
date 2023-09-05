public class EjemploCLaseMath {
    public static void main(String[] args) {
        
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);
        
        double max = Math.max(3.5,1.2);
        System.out.println("max = " + max);
        
        double min = Math.min(3.5,1.2);
        System.out.println("min = " + min);
        
        double techo = Math.ceil(3.5); // esta busca redondear
        System.out.println("techo = " + techo);
        
        double piso = Math.floor(3.5); // hace que redondee para abajo en este caso 3.0
        System.out.println("piso = " + piso);

        long entero = Math.round(Math.PI); // redondea un decimal a entero
        System.out.println("entero = " + entero);
        
        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);
        
        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);
        
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        // metodos trigononometria

        double grados = Math.toDegrees(1.57); // radianes a grados
        grados = Math.round(grados);
        System.out.println("radianes a grados = " + grados);

        double radiantes = Math.toRadians(90.0); //grados a radianes 
        System.out.println("grados a radianes = " + radiantes);

        System.out.println("sen(90) = " + +Math.sin(radiantes));
        System.out.println("cos(90)"+Math.cos(radiantes));

        radiantes = Math.toRadians(180.00);
        System.out.println("cos(180) = " + Math.cos(radiantes));
        radiantes = Math.toRadians(0.00);
        System.out.println("cos(180) = " + Math.cos(radiantes));
        
    }
}
