package Libreria;

import javax.swing.*;

public class Visualizar {
        public void visualizarConsola(String mensaje){
            System.out.println(mensaje);
        }
        public void visualizarVentana(String mensaje){
            JOptionPane.showInputDialog(null,mensaje);
        }
}
