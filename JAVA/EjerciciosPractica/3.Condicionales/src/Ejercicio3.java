/*
    Hacer un programa que lea un carácter por teclado y compruebe su es una letra
    mayuscula
 */

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[]args) throws Exception{
        char letra;
        letra = JOptionPane.showInputDialog("Ingresa una letra").charAt(0);
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "La letra esta en mayusculas");
        }
        else{
            JOptionPane.showMessageDialog(null, "La letra esta en minuscula");
        }
    }
}
