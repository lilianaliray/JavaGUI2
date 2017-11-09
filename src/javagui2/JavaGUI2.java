/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui2;
// paso 8- importar la clase con la ventana
import interfaces.Window;// import paquete.clases
import javax.swing.JFrame;

/**
 *
 * @author LAB04
 */
public class JavaGUI2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //paso 9- llamado a la clase JFrame
      
        Window ventana = new Window();// crea un objeto tipo window
        ventana.setVisible(true);
        ventana.setBounds(0, 0,600, 600);
        // la siguiente inst. le pone titulo a la ventana
        ventana.setTitle("Mi primer aplicacion con ventana");
        // la siguiente sentencia es para finalizar el proyecto al cerrar
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
       
    }
    
}
