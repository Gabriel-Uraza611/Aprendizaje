/*
Hacer un programa que tome dos numeros y diga si ambos son pares o impares
 */

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[]args) throws Exception{
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero 2: "));
        
        if(numero1%2 == 0 && numero2%2 == 0){

            JOptionPane.showMessageDialog(null, "ambos numeros son pares ");
        }
        else if(numero1%2 != 0 && numero2%2 != 0){

            JOptionPane.showMessageDialog(null, "ambos numeros son impares ");
        }
        else if(numero1%2 == 0 && numero2%2 != 0){

            JOptionPane.showMessageDialog(null, "El primer numero es par y el segundo es impar ");
        }
        else if(numero1%2 != 0 && numero2%2 == 0){

            JOptionPane.showMessageDialog(null, "El primer numero es impar y el segundo es par ");
        }
    }
}
