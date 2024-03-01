import javax.swing.JOptionPane;

public class ComoPonerVentanas 
{
    public static void main(String[] args) throws Exception
    {
        //Se declaran las variables 
        String cadena;
        int entero;
        char letra;
        double decimal;

        //En el caso de las cadenas de texto, es usa el "Jop" y posteriormente showInputDialog
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        /*
            En el caso de los numeros como enteros o decimales, se debe declarar primero el tipo de dato
            por ejemplo Integer o Double, se pone un punto (.) y luego parseTipodeDato, por ejemplo parseInt
            o parseFloat, luego ahi si dentro del parentesis se inserta lo que se ponia anteriormente (JopSout)
        */
        entero = Integer.parseInt(JOptionPane.showInputDialog("Inserte un numero entero: "));
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Inserte un numero decimal: "));
        /* 
            Finalmente en el caso de los caracteres, se pone lo mismo que en cadenas (Jopsout) pero al final
            se pone un punto (.) la palabra (charAt(index)) dentro del parentesis va el numero de caracteres
        */
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);

        /*
            Para mostrar los mensajes se vuelve a usar el objeto Jop, y se usa ShowMessageDialog
            el primer argumento que recibe es de tipo null, posteriormente puedes meter el resto de datos
            como strings y variables, las puedes concatenar usando el "formato"
            "cadenaTexto" +  variable + "\n" + (enter)
         */
        
        JOptionPane.showMessageDialog(null, 
            "La cadena insertada es: " + cadena + "\n" +
            "El entero fue: " + entero + "\n" +
            "El decimal insertado fue: " + decimal + "\n" +
            "La letra insertada fue: " + letra + "\n" );
    }
}
