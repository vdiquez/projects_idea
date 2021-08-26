package clases.ada.fundamentosjava.clase24;

import java.util.Scanner;

public class Impresora {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int numero = escaner.nextInt();
        System.out.println("Introduzca una palabra");
        String palabra = escaner.next();

        System.out.printf("El numero es %d y la palabra es %s", numero, palabra);
    }
}
