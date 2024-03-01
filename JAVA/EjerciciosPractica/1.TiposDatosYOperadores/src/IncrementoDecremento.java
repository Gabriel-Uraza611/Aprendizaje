import javax.swing.JOptionPane;

public class IncrementoDecremento{
    public static void main(String[]args) throws Exception{
         
        //_____________________________ASIGNACION DE VALORES______________________________

        int numero = 10;
        numero += 5;

        //Version Por Consola-------------------
        System.out.println(numero);

        //Version Por Ventanas------------------

        JOptionPane.showMessageDialog(null, numero);


        //_________________________INCREMENTO Y DECREMENTO_________________________________

        // Al igual que en cpp puedes aumentar en 1 o disminuir en 1 con el ++ o --

        int numero2 = 10;
        numero2 ++;

        //Consola----------------------------
        System.out.println(numero2);

        //Ventana---------------------------

        JOptionPane.showMessageDialog(null, numero2);

        numero2 --;

        System.out.println(numero2);
        JOptionPane.showMessageDialog(null, numero2);

        

        //___________________________NOTA IMPORTANTE!_______________________________________

        //Al asignar un ++ o -- es importante tener en cuenta en que momento ponemos este atributo
        //si lo ponemos antes de la variable es decir (++variable) el +1 se pondra antes de asignar el valor
        // en cambio si lo ponemos despues se asignara despues.
        //EJEMPLO---------------------------------

        //En este caso la variable de y toma el valor de 10 porque el aumento se hace despues de haber sido asignada
        int x = 10, y;
        y = x++;

        System.out.println(y);
        //En este caso, como la variable es aumentada desde un principio, el valor de j ahora si sera i+1
        int i = 10, j;
        j = ++i;
        
        System.out.println(j);
    }
}

