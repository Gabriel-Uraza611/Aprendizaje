//Leer un numero y mostrar su cuadrado, repetir el
//proceso hasta que se introduzca un numero negativo

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        int numero, cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while(numero >= 0){
            cuadrado = (int)Math.pow(numero,2);
            JOptionPane.showMessageDialog(null,
            "El numero " + numero + " elevado al cuadrado, \n" +
            "da como resultado: " + cuadrado );
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
    }
}
