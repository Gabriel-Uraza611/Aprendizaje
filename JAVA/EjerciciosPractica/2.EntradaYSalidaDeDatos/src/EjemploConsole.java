import java.util.Scanner;

public class EjemploConsole{
    public static void main(String []args) throws Exception{
        String nombre, apellido, ocupacion, fe;
        int edad, cedula, FechaCumpleaños;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Hola, porfavor, llena la siguiente encusta: ");

        System.out.println("Cual es tu nombre?: ");
        nombre = entrada.nextLine();
        System.out.println("Cual es tu apellido?: ");
        apellido = entrada.nextLine();
        System.out.println("Cual es tu edad: ");
        edad = entrada.nextInt();
        System.out.println("Cual es tu cedula: ");
        cedula = entrada.nextInt();
        System.out.println("Cual es tu Fecha de Cumpleaños: ");
        FechaCumpleaños = entrada.nextInt();
        System.out.println("Cual es tu Ocupacion: ");
        ocupacion = entrada.nextLine();
        System.out.println("Cual es tu fe?: ");
        fe = entrada.nextLine();

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Cedula: " + cedula);
        System.out.println("FechaCumpleaños: " + FechaCumpleaños );
        System.out.println("Ocuapcion: " + ocupacion);
        System.out.println("Fe: " + fe);
    }
}