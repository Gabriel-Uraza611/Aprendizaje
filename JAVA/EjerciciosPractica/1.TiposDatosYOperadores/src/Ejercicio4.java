/*
    Construir un programa que, dado un numero total de horas, devuelve el numero
    de semanas, dias y horas equivalentes. Por ejemplo, dado un total de 1000 horas
    debe mostrar 5 semanas, 6 dias y 16 horas
 */

import javax.swing.JOptionPane;
//import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args) throws Exception{
        
        //--------------------------------VENTANAS------------------------------------------
    
        int HorasTotales, semanas, dias, horas;

        HorasTotales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de Horas"));
        semanas = (HorasTotales / 168);
        dias = ((HorasTotales % 168) / 24);
        horas = (HorasTotales % 24);

        JOptionPane.showMessageDialog(null, 
        
        "Horas totales: " + HorasTotales + "\n" +
        "Semanas: " + semanas + "\n" +
        "Dias: " + dias + "\n" +
        "Horas: " + horas + "\n");

        //--------------------------------CONSOLA------------------------------------------

        /* 
        Scanner entrada = new Scanner(System.in);
        int HorasTotales, semanas, dias, horas;

        System.out.println("Ingrese el numero de horas totales: ");
        HorasTotales = entrada.nextInt();

        semanas = (HorasTotales / 168);
        dias = ((HorasTotales % 168) / 24);
        horas = (HorasTotales % 24);

        System.out.println(
        "Horas totales: " + HorasTotales + "\n" +
        "Semanas: " + semanas + "\n" +
        "Dias: " + dias + "\n" +
        "Horas: " + horas + "\n");

        */
    }
}
