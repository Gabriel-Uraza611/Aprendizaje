/*
Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se han
introducido
*/

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception{
        int numero, contador = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while(numero >= 0){
            contador ++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));

        }
        JOptionPane.showMessageDialog(null,
        "La cantidad de numeros ingresada antes del negativo fueron: " + contador);
    }
    
}
