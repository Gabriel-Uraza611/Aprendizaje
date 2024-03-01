//Pedir numero ahsta que se teclee un 0, mostrar la suma de todos los numeros introducidos

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[]args)throws Exception{
        int numero, suma = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if(numero == 0){
            JOptionPane.showMessageDialog(null, "La suma de los numeros es de 0");
        }
        else{
            while(numero != 0){
                suma += numero;
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro  numero"));
            }
            JOptionPane.showMessageDialog(null, "La suma de los numeros ingresados es de: " + suma);
        }
    }
}
