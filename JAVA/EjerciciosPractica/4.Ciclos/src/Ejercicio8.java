/*
Pedir un numero N y mostrar todos los numeros del 1 al N
 */

import javax.swing.JOptionPane;
public class Ejercicio8 {
    public static void main(String[]args) throws Exception{
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero N"));
        JOptionPane.showMessageDialog(null, 
        "Los numeros del 1 hasta el " + numero + "son: ");
        for(int i = 1; i <= numero; i++){
            System.out.println(i);
        }
    }
}
