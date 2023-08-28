import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String [] nombres =  {"Andres","Pepe","Maria","Paco","Lalo","Bea","Pato","Pepa"};
        int count = nombres.length; // esta es una practica para optimizar esto
        for (int i = 0; i<count;i++){
            if(nombres[i].equalsIgnoreCase("andres")||nombres[i].equalsIgnoreCase("pepa")){ // esta es una forma de evitar otros string
                continue;
            }
            System.out.println(i+".-  "+nombres[i]);
        }
        String search = JOptionPane.showInputDialog("Ingrese un nombre, ejem \"Pepe\" o \"Maria\":");
        System.out.println("buscar = " + search);

        boolean finded = false;
        for (int i =0 ; i<count;i++){
            if(nombres[i].equalsIgnoreCase(search)) {
                finded = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }

    if(finded){
        JOptionPane.showMessageDialog(null,search+" Fue encontrado!");
    }else {
        JOptionPane.showMessageDialog(null,search+" no Fue encontrado!");
    }
    }
}
