package clases.ada.fundamentosjava.clase19;

import java.util.Scanner;

public class ECSEj1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el numero del día que quiere seleccionar: ");
        int day = lector.nextInt();
        String dayString;

        // instrucción switch con tipo de datos int
        switch (day) {
            case 1:
                dayString = "Lunes";
                break;
            case 2:
                dayString = "Martes";
                break;
            case 3:
                dayString = "Miercoles";
                break;
            case 4:
                dayString = "Jueves";
                break;
            case 5:
                dayString = "Viernes";
                break;
            case 6:
                dayString = "Sabado";
                break;
            case 7:
                dayString = "Domingo";
                break;
            default:
                dayString = "Dia inválido";
                break;
        }
        System.out.println("El día seleccionado es: " + dayString);
    }
}
