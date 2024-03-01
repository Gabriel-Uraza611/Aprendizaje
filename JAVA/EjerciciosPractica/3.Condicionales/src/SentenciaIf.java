/*
    La sentencia if:

    if(condicion){
        Instruccion1;
    }
    else{
        Instruccion2;
    }

    OPERADORES DE COMPARACION

    ==: IGUALDAD ENTRE VALORES
    !=: DIFERENCIA ENTRE VALORES, DISTINTO DE
    > : MAYOR QUE
    < : MENOR QUE
    >=: MAYOR IGUAL QUE
    <=: MENOR IGUAL QUE

 */

import javax.swing.JOptionPane;

public class SentenciaIf {
    public static void main(String[] args) throws Exception {
        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
        
        if(numero == dato){
            JOptionPane.showMessageDialog(null, "El numero ingresado es igual al dato");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero ingresado no es igual al dato");
        }
    }
}
