
/*
    Pedir dos numeros y decir cual es el mayor o si son iguales
 */

 import javax.swing.JOptionPane;

 public class Ejercicio2 {
     public static void main(String[]args) throws Exception{
         int numero1, numero2;
         numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1: "));
         numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2: "));
         if(numero1 > numero2){
             JOptionPane.showMessageDialog(null, "El numero 1 es mayor que el 2");
         }
         else if(numero1 < numero2){
             JOptionPane.showMessageDialog(null, "El numero 2 es mayor que el 1");
         }
         else{
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
         }
     }
     
 }