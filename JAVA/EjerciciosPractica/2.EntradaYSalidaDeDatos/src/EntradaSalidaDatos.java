import java.util.Scanner;

public class EntradaSalidaDatos {
    public static void main(String[] args) throws Exception {
        /* ------------------------COMO FUNCIONA EL INPUT Y EL OUTPUT-------------------------------------


        //se Crea una variable que admita una entrada
        Scanner entrada = new Scanner(System.in);

        //Se declaran las variables que van a recibir un dato
        float decimal;
        int entero;

        //Se pone VariableQueAlmacenaElDato = VariableDeEntada.next(tipo de dato) *si es int o float
        
        //EJEMPLO CON FLOAT----------------------------
        System.out.println("Digite un decimal: ");
        decimal = entrada.nextFloat();

        System.out.println("El numero decimal fue: " + decimal);


        //EJEMPLO CON INT-----------------------------------
        System.out.println("Digite un entero : ");
        entero = entrada.nextInt();

        System.out.println("El numero entero  fue " + entero);

        */


        //----------------------------EJERCICIO #1--------------------------------------
            /* 
            //Escribir un programa que muestre por pantalla la cadena holamundo!

                System.out.println("HolaMundo!");

            */



        //----------------------------EJERCICIO #2--------------------------------------

            /* 
            //Escribir un programa que almacene la cadena HolaMundo! en una variable y 
            //luego la muestre por pantalla

                String palabra = "HolaMundo!";
                System.out.println(palabra);

            */
        
        //----------------------------EJERCICIO #3--------------------------------------


            /* 
            //Escribir un programa que pregunte el nombre del usuario en la consola y después 
            //de que el usuario lo introduzca muestre por pantalla la cadena ¡Hola <nombre>!, 
            //donde <nombre> es el nombre que el usuario haya introducido.

                Scanner entrada = new Scanner(System.in);
                String nombre;
                System.out.println("Porfavor introduzca su nombre");
                nombre = entrada.next();
                System.out.println("Su nombre es: " + nombre);

            */
    }
}

