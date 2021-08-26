package clases.ada.fundamentosjava.clase25;

import java.util.Scanner;

public class Ejercicio3_10 {
    public static void main(String[] args) {
        int fila = 2, col = 2;
        boolean diagonal = true;
        Scanner teclado = new Scanner(System.in);
        int [][] matriz = new int[fila][col];
        int [][] matrizB = new int[fila][col];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Ingrese los valores de la matriz 1, fila %d, columna %d: ", i, j);
                matriz[i][j] = teclado.nextInt();
                System.out.printf("Ingrese los valores de la matriz 2, fila %d, columna %d: ", i, j);
                matrizB[i][j] = teclado.nextInt();
            }
        }

        for(int i = 0; i<fila; i++){
            if (matriz[i][i] != matrizB[i][i]) {
                diagonal = false;
                break;
            }
        }
        if(diagonal){
            System.out.println("Las diagonales de las matrices son iguales.");
        } else{
            System.out.println("Las diagonales de las matrices no son iguales.");
        }
    }
}