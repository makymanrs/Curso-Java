public class ConversionDeTipos {
    public static void main(String[] args) {
        String numerostr = "50";

        int numeroInt = Integer.parseInt(numerostr);
        System.out.println("numeroInt = " + numeroInt);
        
        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "false";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        // convertir en string a entero parse int
        // primitvo integer a un tipo string Integer.tostring
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        // convertir primitivo a un tipo string
        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        
        otroRealStr = String.valueOf(1.23456f);
        System.out.println("otroRealStr = " + otroRealStr);
        
        int i= 32768;
        short s = (short) i; // usamos cast
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);

      
        char b=(char) i;
        System.out.println("b = " + b);
    }
}
