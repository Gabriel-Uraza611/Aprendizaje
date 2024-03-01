import javax.swing.JOptionPane;

public class EjemploVentana{
    public static void main(String[]args) throws Exception{
        String nombre, apellido, ocupacion, fe; 
        int edad, cedula, FechaCumpleaños;

        JOptionPane.showMessageDialog(null, 
        "Hola, Bienvenido a nuestro sistema de registro.\n "+
        "porfavor responde las siguientes preguntas \n");

        nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ");
        apellido = JOptionPane.showInputDialog("Ahora, Ingresa tu apellido: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad: "));
        cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu cedula: "));
        FechaCumpleaños = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu fecha de cumpleaños: "));
        ocupacion = JOptionPane.showInputDialog("Ingresa tu ocupacion actual: ");
        fe = JOptionPane.showInputDialog("Ingresa tu fe: ");

        JOptionPane.showMessageDialog(null,
            "Tu nombre es:" + nombre + "\n" +
            "Tu apellido es:" + apellido + "\n" +
            "Tu edad es:" + edad + "\n" +
            "Tu cedula es:" + cedula + "\n" +
            "Tu FechaCumpleaños es:" + FechaCumpleaños + "\n" +
            "Tu ocupacion es:" + ocupacion + "\n" +
            "Tu fe es:" + fe + "\n");
    }
}