/*
 Pedir tres numeros y mostrarlos ordenados de mayor a menor
 */
import javax.swing.JOptionPane;
public class Ejercicio7 {
    public static void main(String[]args) throws Exception{
        int num1, num2, num3, aux;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 3: "));

        if(num1 > num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if(num2 > num3){
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        if(num2 < num1){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        JOptionPane.showMessageDialog(null,
        "El numero menor es: " + num1 + "\n" +
        "El numero medio es: " + num2 + "\n" +
        "El numero medio es: " + num3 + "\n"); 
    }
}
