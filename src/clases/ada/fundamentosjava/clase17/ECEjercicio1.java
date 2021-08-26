package clases.ada.fundamentosjava.clase17;

import java.util.Scanner;

public class ECEjercicio1 {

    public static void main(String[] args) {
        Scanner pregunton = new Scanner(System.in);

        System.out.println("Introduzca cuál es la edad mínima para votar en su país: ");
        byte edadMinimaVotar = pregunton.nextByte();

        System.out.println("Introduzca cuál es la edad del votante: ");
        byte edadVotante = pregunton.nextByte();

        if (edadVotante >= edadMinimaVotar) {
            System.out.println("Usted puede votar");
        } else {
            System.out.println("Usted no puede ni opinar");
        }
    }
}
