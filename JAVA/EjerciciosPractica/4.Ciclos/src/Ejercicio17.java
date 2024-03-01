/* 
Una empresa que se dedica a la venta de desinfectantes necesita
un programa para gestionar las facturas. En cada factura figura: el
código del artículo, la cantidad de vendida en litros y el 
precio por litro. Se pide de 5 facturas introducidas:
Facturacion total, cantidad en litros vendidos del articulo 1
y cuantas facturas se emiteiron de más de $600.
*/

import javax.swing.JOptionPane;
public class Ejercicio17 
{
    public static void main(String[]args)throws Exception
    {
        double  litros, LitrosArticulo1 = 0, PrecioXLitro;
        int codigo, FacturacionTotal = 0, FacturasMayores = 0;

        for(int i = 0; i <= 5; i++)
        {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del la factura #" + i + " : "));
            litros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese La cantidad vendiad en litros de la factura #" + i + " : "));
            PrecioXLitro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por litro #" + i + " : "));

            FacturacionTotal += PrecioXLitro;
            if(codigo == 8159419){
                LitrosArticulo1 += litros;
            }

            if(PrecioXLitro > 600){
                FacturasMayores += 1;
            }
        }

        JOptionPane.showMessageDialog(null, 
        "Facturacion Total: " + FacturacionTotal + "$\n" +
        "Cantidad de litros vendido del Articulo 1" + LitrosArticulo1 + "lt\n" +
        "Facturas mayores a 600$: " + FacturasMayores + "\n");

    }
}
