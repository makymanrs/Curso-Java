public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo); // esta es explicita
        Integer intObjeto2 = 32768; // esta es implicita
        System.out.println("intObjeto = " + intObjeto);
        
        // objeto integer y convertirlo a un primitivo
        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue(); // este metodo retorna el valor primitivo del objeto
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd); // lo convierte a integer este String de la linea 15
        System.out.println("valor = " + valor);
        
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto.byteValue(); // esta manera hay perdida de informacion
        System.out.println("byteObjeto = " + byteObjeto); // en resumen un integer no se puede convertir a byte

        Long longValue = intObjeto.longValue();
        System.out.println("longValue = " + longValue);
    }
}
