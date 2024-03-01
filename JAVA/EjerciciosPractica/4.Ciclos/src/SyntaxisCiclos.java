/*
    ----------------------------Ciclo While---------------------------------

    While(Condicion){
        Instruccion;
    }

    ----------------------------Ciclo Do While------------------------------
    do{
        Instruccion;
    }while(condicion);
    ----------------------------Ciclo For-----------------------------------
    for(inicializacion, condicion, aumento o decremento){
        Instrucciones;
    }
 */


public class SyntaxisCiclos {
    public static void main(String[]args) throws Exception{
        //CICLO WHILE------------------------------------------------
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }

        //Ciclo do While---------------------------------------------
        //Se usa en menu de opciones
        int j = 11;
        do{
            System.out.println(j);
            j++;
        }while(j <= 10);

        //Ciclo For-------------------------------------------------
        for(int k = 0; k < 10; k++){
            System.out.println(k);
        }
    }
    
}
