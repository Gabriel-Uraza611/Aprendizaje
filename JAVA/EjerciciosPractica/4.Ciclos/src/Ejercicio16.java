/*
Pide un numero (que debe estar entre 0 y 10) y mostrar
la tabla de multiplicar de dicho numero
*/

import javax.swing.JOptionPane;

public class Ejercicio16
{
    public static void main(String[]args)throws Exception
    {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre el y y 10"));
        for(int i = 1; i <= 10; i++){
            JOptionPane.showMessageDialog(null, num + " * " + i + " = " + num*i);
        }
    }
    
}
