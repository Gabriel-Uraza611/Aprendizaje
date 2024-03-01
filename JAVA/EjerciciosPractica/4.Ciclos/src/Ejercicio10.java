//Pedir 10 números y escribir la suma total.

import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[]args)throws Exception{
        int num, suma = 0;
        for(int i = 1; i <=10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            suma += num;
        }
        JOptionPane.showMessageDialog(null, "La suma de los numeros es de: " + suma);
    }
}
