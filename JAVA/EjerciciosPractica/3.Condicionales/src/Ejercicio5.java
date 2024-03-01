/*
    Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
    Si trabaja 40 horas o menos se le paga 16$ por hora. Si trabaja mas de 40 horas se le paga 
    $16 por cada una de las primeras 40 horas y 20$ por cada hora extra
 */

import javax.swing.JOptionPane;

public class Ejercicio5 {
    public static void main(String[]args) throws Exception{
        int HorasTrabajadas;
        HorasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas: "));

        if(HorasTrabajadas > 40){
            int HorasExtra = HorasTrabajadas - 40;
            HorasTrabajadas -= HorasExtra;
            JOptionPane.showMessageDialog(null,
            "Has trabajado un total de:" + (HorasTrabajadas+HorasExtra) + "\n" +
            "Total de Horas Minimas: 40, Pago: " + (HorasTrabajadas*16) + "$\n" +
            "Total de Horas Extra: " + HorasExtra + ", Pago: " + (HorasExtra*20) + "$");
        }
        else{
            JOptionPane.showMessageDialog(null,
            "Has trabajado menos de 40 horas \n" +
            "Horas trabajadas: " + HorasTrabajadas + ", Pago:" + HorasTrabajadas*16 + "$");
        }
    }
}
