public class TiposDatos{ //Declaracion de la clase con base al nombre del archivo "creo"
    public static void main(String[] args) throws Exception { //Declaracion de la funcion main
        
        //---------------------------------DATOS PRIMITIVOS---------------------------------

        //Declaracion de variables nuemricas enteras (4)
        byte ByteNumber = 127;
        short ShortNumber = 32767;
        int IntNumber = 2147483647;
        long LongNumber = 922337285;
        System.out.println("El numero limite del byte es de: " + ByteNumber);
        System.out.println("El numero limite del short es de: " + ShortNumber);
        System.out.println("El numero limite del int es de: " + IntNumber);
        System.out.println("El numero limite del long es de: " + LongNumber );

        //Declaracion de variables decimales  (2)

        float FloatNumber = 0.040f; // Se pone una f al final del numero tipo float
        double DoubleNumber = 0.053146;

        System.out.println("El numero limite del float es de: " + FloatNumber);
        System.out.println("El numero limite del double es de: " + DoubleNumber);
        
        //Declaracion de booleanos: (2)

        boolean VariableTrue = true;
        boolean VariableFalse = false;

        System.out.println("Esto es un booleano verdadero: " + VariableTrue);
        System.out.println("Esto es un booleano falso: " + VariableFalse);

        //Declaracion de variable tipo caracteres

        char VariableCaracter = 'a';
        System.out.println("Esto es un caracter: " + VariableCaracter);


        //------------------------------DATOS NO PRIMITIVOS Y CADENAS-------------------------

        /*
            A diferencia de los datos de tipo primitivo, los datos de tipo no primitivo, son objetos y no 
            tienen un valor predefinido son capaces de almacenar valores vacios, por ejemplo Null.
            
            NOTA: Los datos no primitivos siempre empiezan con mayuscula como String, Integer o Array, en
            cambio los de caracter primitivo van en minuscula. Ademas los de tipo no primitivo son objetos
         */

        //Ejemplo con Null:

        Integer NumeroNoPrimitivo = null;
        System.out.println("Esto es una variable de tipo no primitivo:" + NumeroNoPrimitivo );


        String StringsChain = "Hola Hermano,Como Estas"; // Las variables de tipo string se deben definir en mayuscula
        System.out.println("Esto es una cadena de strings:" + StringsChain);

        //------------------------------------------CONSTANTES-------------------------------
        /*
            Es una forma de declarar variables para que estas sean inmutables, es decir una vez definidas
            no se pueden modificar posteriormente, es algo asi como una tupla para una variable
            este tipo de variables se declara con la palabra final al comienzo de la declaracion de la variable
         */

        //Ejemplo:

        final float NumeroConstante = 3.1416f;
        System.out.println("Esto es una constante:" + NumeroConstante);
    }   
}