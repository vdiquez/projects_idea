package clases.ada.fundamentosjava.clase11;
/*
2.Una empresa importadora desea determinar cuántos dólares
puede adquirir con equis cantidad de dinero argentino. Realice
un diagrama de flujo y pseudocódigo que representen el algoritmo
para tal fin.
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("*****Ejercicio 2*******");
        Scanner lector = new Scanner(System.in);
        double dolarEnArgentina, cantPesosArgentinos, totalDolares;
        System.out.print("Introduzca el precio del dolar hoy: ");
        dolarEnArgentina = lector.nextDouble();
        System.out.print("Introduzca la cantidad de ARS que desea cangear: ");
        cantPesosArgentinos = lector.nextDouble();
        totalDolares = cantPesosArgentinos / dolarEnArgentina;
        System.out.printf("La cantidad de dolares a recibir es de: %.2f dolares\n"
                , totalDolares);
        System.out.printf("%.4f\n", totalDolares);
        System.out.printf("%.1f %.2f %.4f %.5f %.2f %.6f", totalDolares, totalDolares, totalDolares, totalDolares, totalDolares, totalDolares);

    }
}
