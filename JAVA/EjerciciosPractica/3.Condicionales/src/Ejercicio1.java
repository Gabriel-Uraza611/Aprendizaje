/*
 Hacer un programa que lea un numero entero y muestre si el numero
  es multiplo de 10
 */

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[]args) throws Exception{
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if(numero % 10 == 0){
            JOptionPane.showMessageDialog(null, "El numero es multiplo de 10");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero NO es multiplo de 10");

        }
    }
    
}
