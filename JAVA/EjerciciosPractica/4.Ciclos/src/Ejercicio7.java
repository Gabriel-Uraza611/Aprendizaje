/*
Pedir numeros hasta que se introduzca uno negativo, y calcular la media
 */

import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[]args) throws Exception{
        int numero, suma = 0, contador = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if(numero < 0){
            JOptionPane.showMessageDialog(null, 
            "El numero ingresado es menor a 0, la media es de: " + numero);
        }
        else{
            while(numero >= 0){
            suma += numero;
            contador ++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
            }
            JOptionPane.showMessageDialog(null, 
            "El promedio de numeros ingresados es de: " + (suma / contador));
        }   
    }
}
