/*
        LA SENTENCIA SWITCH

        switch(variable){
        case 1: Instruccion1;
                break;
        case 2: Instruccion2;
                break;
        ...

        case n: InstruccionN;
                break
        finally: CasoContrario;
                break;
        }
 */

import javax.swing.JOptionPane;

public class SentenciaSwitch 
{
        public static void main(String[]args) throws Exception
        {

                int numero; 

                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre el 1 y el 5: "));

                switch(numero)
                {
                        case 1: JOptionPane.showMessageDialog(null,"a");
                                break;
                        case 2: JOptionPane.showMessageDialog(null, "Escribiste el numero 2");
                                break;

                        case 3: JOptionPane.showMessageDialog(null, "Escribiste el numero 3");
                                break;
                        
                        case 4: JOptionPane.showMessageDialog(null, "Escribiste el numero 4");
                                break;

                        case 5: JOptionPane.showMessageDialog(null, "Escribiste el numero 5");
                                break;

                        default: JOptionPane.showMessageDialog(null, "El numero esta fuera del rango de 1 y 5");
                                break;
                }
        }
}

