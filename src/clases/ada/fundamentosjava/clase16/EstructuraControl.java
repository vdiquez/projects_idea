package clases.ada.fundamentosjava.clase16;

public class EstructuraControl {
    static String nombre;
    public static void main(String[] args) {
        if (nombre != null) {
            System.out.println("El nombre es: " + nombre);
        } else {
            nombre = "Salome";
            System.out.println("El nombre es: " + nombre);
        }

        int a = 10;
        int b = 90;

        if (a > b) {
            System.out.println("A es mayor que B");
        } else if (a == b) {
            System.out.println("A es igual que B");
        } else {
            System.out.println("A es menor que B");
        }

        System.out.println("Fin del programa");
    }
}
