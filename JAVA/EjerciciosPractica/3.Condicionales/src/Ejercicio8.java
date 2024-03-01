/*
    Pedir un numero entre 0 y 99_999 y decir cuantas cifras tiene.
 */

import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[]args) throws Exception{
        int numero;

        for(int i = 1; i <= 5; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero entre el 0 y el 99.999: "));

            if(numero >= 0 && numero <=9){
                JOptionPane.showMessageDialog(null, "El numero ingresado tien una cifra");

            }
            else if(numero >=10 && numero <= 99){
                JOptionPane.showMessageDialog(null, "El numero ingresado tien dos cifras");

            }
            else if(numero >= 100 && numero <= 999){
                JOptionPane.showMessageDialog(null, "El numero ingresado tien tres cifras");

            }
            else if(numero >= 1_000 && numero <= 9_999){
                JOptionPane.showMessageDialog(null, "El numero ingresado tien cuatro cifras");

            }
            else if(numero >= 10_000 && numero <= 99_999){
                JOptionPane.showMessageDialog(null, "El numero ingresado tien cinco cifras");

            }
        }
    }
}
