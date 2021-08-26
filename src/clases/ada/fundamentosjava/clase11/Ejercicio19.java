package clases.ada.fundamentosjava.clase11;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        /*
        19.	El hotel “Cama Arena” requiere determinar lo que le debe cobrar
         a un huésped por su estancia en una de sus habitaciones. Determinar ese cobro.
        */
        int diasEstadia;
        float precioDia;
        float precioTotal;
        Scanner lector =  new Scanner(System.in);
        System.out.println("Ingrese los dias de estadía: ");
        diasEstadia = lector.nextInt();
        System.out.println("Ingrese el precio por día: ");
        precioDia = lector.nextFloat();
        precioTotal = diasEstadia * precioDia;
        System.out.printf("El precio total por su estancia es de : $%.2f", precioTotal);

    }
}
