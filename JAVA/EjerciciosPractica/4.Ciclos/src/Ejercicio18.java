//Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos

import javax.swing.JOptionPane;

public class Ejercicio18 {
    public static void main(String[]args)throws Exception{
        int CantidadAlumnos, nota, promedio, aprobados = 0, suspendidos = 0;

        CantidadAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos: "));
        for(int i = 1; i <= CantidadAlumnos; i++)
        {
            promedio = 0;
            for( int j = 1; j <= 6; j++)
            {
                nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota #" + j + ": "));
                promedio += nota;
            }
        
            promedio /= 6;
            if(promedio > 6){
                aprobados += 1;
            }
            else{
                suspendidos += 1;
            }
        }   
        JOptionPane.showMessageDialog(null,
        "ESTUDIANTES APROBADOS: " + aprobados + "\n" +
        "ESTUDIANTES REPROBADOS: " + suspendidos);

    }
}
