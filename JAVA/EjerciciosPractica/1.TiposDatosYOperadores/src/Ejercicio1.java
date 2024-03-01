//Hacer un programa que calcule e imprima la suma de tres calificaciones

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[]args) throws Exception{
        /* 
        //----------------------USANDO CONSOLA------------------------------
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, resultado;

        System.out.println("Hola, porfavor ingrese su primera nota: ");
        nota1 = entrada.nextFloat();

        System.out.println("ingrese su la segunda nota: ");
        nota2 = entrada.nextFloat();

        System.out.println("Ingrese la tercera nota: ");
        nota3 = entrada.nextFloat();

        resultado = ((nota1 + nota2 + nota3)/3);
        System.out.println("Su promedio fue de : " + resultado);
        */

        //----------------------USANDO VENTANAS------------------------------

        float nota1, nota2, nota3, resultado;

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Porfavor Ingresa la nota 1: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Porfavor Ingresa la nota 2: "));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Porfavor Ingresa la nota 3: "));

        resultado = ((nota1 + nota2 + nota3) / 3);

        JOptionPane.showMessageDialog(null, "Su promedio fue de: " + resultado);
    
    }        
    
}
