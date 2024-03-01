//Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura
// media, la cantidad de alumnos mayores de 18 años, y la cantidad de 
//alumnos que miden más de 1.75

import javax.swing.JOptionPane;

public class Ejercicio15 
{
    public static void main(String[]args)throws Exception
    {
        int edad = 0, AlumnosMayores = 0, AlumnosAltos = 0;
        double estatura = 0, MediaEstaturas = 0, MediaEdades = 0;

        for(int i = 1; i <= 5; i++)
        {
            edad = Integer.parseInt(
            JOptionPane.showInputDialog(null, 
            "Porfavor ingrese la edad #" + i + ":" ));
            MediaEdades += edad;
            if(edad >= 18){
                AlumnosMayores += 1;
            }

            estatura = Double.parseDouble(
            JOptionPane.showInputDialog(null, 
            "Porfavor ingrese la estatura #" + i + ":" ));
            MediaEstaturas += estatura;
            if(estatura >= 1.75){
                AlumnosAltos += 1;
            }
        }
        MediaEstaturas /= 5;
        MediaEdades /= 5;
        JOptionPane.showMessageDialog(null,
        "MEDIA DE EDAD: " + MediaEdades + "\n" +
        "MEDIA DE ESTATURA " + MediaEstaturas + "\n" +
        "ESTUDIANTES MAYORES DE EDAD: " + AlumnosMayores + "\n" +
        "ESTUDIANTES DE 1.75 o más " + AlumnosAltos + "\n" );
    }
}
