/*
    La calificaciones finales de un estudiante de informatica se calculan con base 
    a las calificaciones de cuatro aspectos de su rendimiento académico:
    participacion, primer examen parcial, segundo examen parcial y examen final. 
    Sabiendo que las calificaciones anteriores entran a la calificación final con
    ponderaciones del 10%, 25%, 25% y 40%, Hacer un programa que calcule e imprima
    la calificación final obtenida por un estudiante.
*/

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[]args) throws Exception{
        float participacion, parcial1, parcial2, ParcialFinal, promedio;
         

        participacion = Float.parseFloat(JOptionPane.showInputDialog("Porfavor ingresa tu nota de participacion: "));
        parcial1 = Float.parseFloat(JOptionPane.showInputDialog("Porfavor ingresa tu nota del parcial 1: "));
        parcial2 = Float.parseFloat(JOptionPane.showInputDialog("Porfavor ingresa tu nota del parcial 2: "));
        ParcialFinal = Float.parseFloat(JOptionPane.showInputDialog("Porfavor ingresa tu nota del parcial final: "));

        participacion *= 0.10f;
        parcial1 *= 0.25f;
        parcial2 *= 0.25f;
        ParcialFinal *= 0.40f;

        promedio = participacion + parcial1 + parcial2 + ParcialFinal;

        JOptionPane.showMessageDialog(null, promedio);
    }
    
}
