import javax.swing.*;

public class Seccion5Tarea10 {
    public static void main(String[] args) {
    int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu pricnipal\n"+
                            "1) Actualizar\n"+
                            "2) Eliminar\n"+
                            "3) Agregar\n"+
                            "4) Listar\n"+
                            "5) Salir\n"+
                            "ELIJA UNA OPCION",JOptionPane.YES_NO_CANCEL_OPTION));
            switch (opcion){
                case 1:
                    JOptionPane.showMessageDialog(null,"se a actualizado");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Se a eliminado");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Se a agregado");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Se a listado");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"has salido del programa con exito!!");
                    System.exit(0);
                    break;
            }
        }while (opcion!=5);
    }
}
