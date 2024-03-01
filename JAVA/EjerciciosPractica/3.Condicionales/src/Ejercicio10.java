/*
Hacer un programa que simule un cajero automatico con un saldo
inicial de 1000 Dolares, con el siguiente menu de opciones:

1. Ingresar dinero a la cuenta
2. Retirar dinero de la cuenta
3. Salir
*/

import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[]args)throws Exception{
        int saldo = 1000, cantidad ,opcion;
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
        "Hola, en este momento tiene un saldo inicial de 1000usd \n" +
        "Porfavor elija una de las siguientes opciones: \n" + 
        "1. Ingresar dinero a la cuenta \n" +
        "2. Retirar dinero de la cuenta \n" +
        "3. Salir"));

        switch(opcion){
            case 1: 
                cantidad = Integer.parseInt(JOptionPane.showInputDialog(
                    "¿Cuanto dinero desea ingresar?:"));
                saldo += cantidad;
                JOptionPane.showMessageDialog(null, "Su saldo actual ahora es de: " + saldo);
                break;
            
            case 2: 
            cantidad = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuanto dinero desea retirar?:"));
            
            if(cantidad > saldo){
                JOptionPane.showMessageDialog(null, 
                "Lo sentimos, no puedes retirar mas de lo que tienes");
            }
            else{
            saldo -= cantidad;
            JOptionPane.showMessageDialog(null, "Su saldo actual ahora es de: " + saldo);
            }
            break;
            case 3:break;
            default : JOptionPane.showMessageDialog(null, "Se equivoco de numero JaJa");
        }
    }
}
