/*  
    En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los
    $300. ¿Cual sera la cantidad que pagara una persona por su compra?
 */

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[]args) throws Exception{
        int precio, descuento;
        precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de su compra: "));

        if(precio > 300){
            descuento = precio;
            descuento *= 0.2;
            precio -= descuento;
            JOptionPane.showMessageDialog(null, 
            "Su compra ha sido mayor a 300$, por lo tanto \n" +
            "se le ha realizado un descuento del 20% \n" + 
            "el valor final de su producto es de: " + precio);
        }
        else{
            JOptionPane.showMessageDialog(null, 
            "Su compra es menor a 300 \n" +
            "Por lo tanto el descuento del 20% no aplica \n" + 
            "el valor final de su producto es de: " + precio);
        }
    }
    
}
