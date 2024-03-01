/*
Construir un programa que simule el funcionamiento de una calculadora que puede realizar
las cuatro operaciones aritmeticas basicas (Suma, resta, producto y division) con valores 
numericos enteros. El usuario debe especificar la operacion con el primer carácter
del primer parámetro de la linea de comandos: S o s para la suma R resta, M multiplicacion
D division.
 */

import javax.swing.JOptionPane;

public class Ejercicio9{
    public static void main(String[]args) throws Exception{
        int num1, num2, resultado;
        char operacion;
        operacion = JOptionPane.showInputDialog(null, "Ingrese el tipo de operacion").charAt(0);
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero 2"));

        if(operacion == 'S' || operacion == 's'){
            resultado = num1 + num2;
            JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado );
        }
        else if(operacion == 'R' || operacion == 'r'){
            resultado = num1 - num2;
            JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resultado );
        }
        else if(operacion == 'M' || operacion == 'm'){
            resultado = num1 * num2;
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + resultado );
        }
        else if(operacion == 'D' || operacion == 'd'){
            resultado = num1 / num2;
            JOptionPane.showMessageDialog(null, "El resultado de la division es: " + resultado );
        }
    }  
}
