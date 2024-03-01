/*Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo. 
  Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa que
  calcule e imprima la cantidad de dinero que tienen entre los tres.
 */
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio2 {
  public static void main(String[]args) throws Exception{

    /* 
    //----------------------USANDO CONSOLA------------------------------
    Scanner entrada = new Scanner(System.in);
    int Guillermo, Luis, Juan, total;

    System.out.println("Porfavor Ingrese la cantidad de dinero de Gillermo: ");
    Guillermo = entrada.nextInt();
    System.out.println("La cantidad que tiene luis es de: " + Guillermo);

    Luis = Guillermo / 2;
    System.out.println("La cantidad que tiene luis es de: " + Luis);

    Juan = ((Guillermo + Luis) / 2);
    System.out.println("La cantidad que tiene luis es de: " + Juan);

    total = Guillermo + Luis + Juan;
    System.out.println("El dinero total sumado entre los 3 es de: " + total);

    */



    //----------------------USANDO VENTANAS------------------------------

    int Guillermo, Luis, Juan, total;

    Guillermo = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese la nota de Guillermo: "));
    Luis = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese la nota de Guillermo: "));
    Juan = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese la nota de Guillermo: "));

    Luis = Guillermo / 2;
    JOptionPane.showMessageDialog(null, "El valor de Luis es de: " + Luis);

    Juan = ((Guillermo + Luis) / 2);
    JOptionPane.showMessageDialog(null, "El valor de Juan es de: " + Juan);

    total = Guillermo + Luis + Juan;
    JOptionPane.showMessageDialog(null, "El monto total es de: " + total);






  }
}
