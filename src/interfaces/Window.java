/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//
 
package interfaces;
// paso 1 importamos las librerias

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author LAB04
 */
//paso 2 -heredar la classe desde JFrame

public class Window extends JFrame
{
    // paso 3- declarar los elementos a utilizar
    JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton;
    
    //paso 4-definir el constructor
    public Window()
    
   {
       //paso 5- crear inicializa los objetos
       panel  = new JPanel();// creo un objeto tipo JPanel
       label = new JLabel();
       text = new JTextField(20);//20 es la cantidad de caracteres
       boton = new JButton();
       
       // paso 6- agregar los elementos al JFrame
       this.add(panel);
       panel.add(label);
       panel.add(text);
       panel.add(boton);
       
       
       //paso 7-propiedades de los objetos
       
       label.setText("Nombre");
       boton.setText("Enviar");
       panel.setBackground(Color.red);//color de fondo del JPanel
       
   }
    
}
