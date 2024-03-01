/*
Realizar un juego para adivinar un numero. Para ello generar un numero
aleatorio entre 0-100, y luego ir pidiendo numeros indicando "es mayor" o
"es menor" según sea mayor o menor con respecto a N. El proceso termina 
cuando el usuario acierta y mostrar el numero de intentos
 */

import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[]args) throws Exception{
        int  intentos = 1;
        double NumeroAleatorio, numero;

        NumeroAleatorio = (int)(Math.random() * 100);
        System.out.println(NumeroAleatorio);
        numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero: "));

        while(numero != NumeroAleatorio){
        
            if(numero > NumeroAleatorio){
                JOptionPane.showMessageDialog(null, "El numero secreto es menor al numero ingresado");
            }
            else if(numero < NumeroAleatorio) {
                JOptionPane.showMessageDialog(null, "El numero secreto es mayor al numero ingresado");
            }
            numero = Double.parseDouble(JOptionPane.showInputDialog("Intentalo nuevamente, ingresa otro numero: "));
            intentos++;
        }
        JOptionPane.showMessageDialog(null, "Haz acertado, numero de intentos: " + intentos);
    }
}

