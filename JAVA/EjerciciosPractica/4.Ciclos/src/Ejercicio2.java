/*
Leer un numero e indicar si es positivo o negativo
el proceso se repetira hasta que se introduza un 0
 */

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[]args)throws Exception{
        int numero, cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        while(numero != 0){
            cuadrado = (int)Math.pow(numero,2);
            JOptionPane.showMessageDialog(null, 
            "El numero " + numero + "elevado al cuadrado, da como resultado: " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
    }
}
