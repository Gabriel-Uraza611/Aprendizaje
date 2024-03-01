//Pedir un numero y calcular su factorial

import javax.swing.JOptionPane;

public class Ejercicio12 {
    public static void main(String[]args) throws Exception{
        int numero, result = 1;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
        for(int i = 1; i <= numero; i++){
            result *= i;
            
        }
        JOptionPane.showMessageDialog(null, "!" + numero + "=" + result);
    }
    
}
