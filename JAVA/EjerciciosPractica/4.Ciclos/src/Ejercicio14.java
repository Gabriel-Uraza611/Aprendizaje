//Pedir 10 sueldos. mostrar su suma y cuantos hay mayores de 100k

import javax.swing.JOptionPane;

public class Ejercicio14 
{
    public static void main(String[]args)throws Exception
    {
        int sueldo, sumatoria = 0, MayoresMil = 0;

        JOptionPane.showMessageDialog(null, "Hola, porfavor ingrese 10 sueldos");

        for(int i = 1; i <= 10; i++){
            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Porfavor  ingrese el valor del sueldo" + i + ":"));
            sumatoria += sueldo; 
            if(sueldo > 100){
                MayoresMil += 1;
            }
        }
        JOptionPane.showMessageDialog(null,
        "La suma total de todos los sueldos es de: " + sumatoria + "\n" +
        "La cantidad de sueldos mayores a mil dolares es de: " + MayoresMil);

    }
}
