package libreria;

import javax.swing.*;

public class Visualizar {
        public static void visualizarConsola(String mensaje){
            System.out.println(mensaje);
        }
        public static void visualizarVentana(String mensaje){
            JOptionPane.showInputDialog(null,mensaje);
        }
}
