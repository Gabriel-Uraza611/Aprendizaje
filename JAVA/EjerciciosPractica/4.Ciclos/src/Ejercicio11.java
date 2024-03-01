/*Diseñar un programa que muestre el producto de los 10 primeros numeros impares */

import javax.swing.JOptionPane;

public class Ejercicio11 
{
    public static void main(String[] args) throws Exception 
    {
        for(int i = 0; i <= 10; i++)
        {
            if(i % 2 == 0)
            {
                continue;
            }
            JOptionPane.showMessageDialog(null, (i*2));
        }
    }
}
