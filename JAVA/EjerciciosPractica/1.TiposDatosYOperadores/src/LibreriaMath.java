

public class LibreriaMath{
    public static void main(String[] args) throws Exception{
        //---------------------------RAIZ CUADRADA------------------------
        double raiz = Math.sqrt(9);
        System.out.println(raiz);

        //--------------------------POTENICA------------------------------
        int base= 5, exponente = 2;
        int resultado = (int)Math.pow(base, exponente);
        System.out.println(resultado);
        
        //-------------------------REDONDEO------------------------------
        double numerox = 4.56;
        long redondeo = Math.round(numerox);
        System.out.println(redondeo);

        //-------------------------RANDOM--------------------------------
        double NumeroRandom = Math.random();
        System.out.println(NumeroRandom);

    }
}