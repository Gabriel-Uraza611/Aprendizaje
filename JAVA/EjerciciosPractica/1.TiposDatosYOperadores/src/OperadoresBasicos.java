//import java.util.Scanner;
import javax.swing.JOptionPane;

public class OperadoresBasicos{
    public static void main(String[] args){

        /* 
        //Version por consola-------------------------------------------------------------

        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;
        float suma, resta, multiplicacion, division, residuo;
        

        System.out.println("Porfavor ingresa el primer numero");
        numero1 = entrada.nextInt();
        System.out.println("Porfavor ingresa el segundo numero");
        numero2 = entrada.nextInt();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        residuo = numero1 % numero2;

        System.out.println(
            "La suma de los numeros es de: " + suma + "\n" +
            "La resta de los numeros es de: " + resta + "\n" +
            "La multiplicacion de los numeros es de: " + multiplicacion + "\n" +
            "La division de los numeros es de : " + division + "\n" +
            "El residuo de los numero es de: " + residuo );

        */

        
        //Version por ventanas------------------------------------------------------------
        int numero1, numero2;
        float suma, resta, multiplicacion, division, residuo;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero 2: "));

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        residuo = numero1 % numero2;

        JOptionPane.showMessageDialog(null, 
            "La suma de los numeros es de: " + suma + "\n" +
            "La resta de los numeros es de: " + resta + "\n" +
            "La multiplicacion de los numeros es de: " + multiplicacion + "\n" +
            "La division de los numeros es de : " + division + "\n" +
            "El residuo de los numero es de: " + residuo );
        
    }
}



