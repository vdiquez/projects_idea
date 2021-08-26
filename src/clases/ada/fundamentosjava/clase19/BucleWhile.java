package clases.ada.fundamentosjava.clase19;

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) throws InterruptedException {
        Scanner lector = new Scanner(System.in);
        System.out.println("Quieres que cuente los numeros del 1 al 20?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int opcionContar = lector.nextInt();
        int i = 1;

        int dato = 65;

        boolean conexionTerminada = true;
        while (conexionTerminada) {
            System.out.println("Iniciando conexion con BD");
            Thread.sleep(4000);
            System.out.println("Esperando terminar la conexion.");
            Thread.sleep(4000);
            System.out.println("Terminando conexion.");
            Thread.sleep(4000);
            conexionTerminada = false;
        }
        if (opcionContar == 2) {
            System.out.println("Perfecto me voy a descansar");
        }
    }
}
