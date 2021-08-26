package clases.ada.fundamentosjava.clase25;
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioExtra {
    public static void main(String[] args) {
        /* Devuelve una columna (array unidimensional) de un array
         * bidimensional que se pasa como parámetro.
         */

        Scanner teclado=new Scanner(System.in);
        //int fila=0,columnas=0;

        System.out.println("ingrese la cantidad de filas ");
        int fila=teclado.nextInt(); //3

        System.out.println("ingrese la cantidad de columnas");
        int columnas=teclado.nextInt(); //5

        int [][] matriz=new int[fila][columnas];

        for (int i=0;i<fila;i++){
            for (int j=0;j<columnas;j++){
                System.out.printf("Ingrese los numeros filas %d columna %d ", i, j);
                matriz[i][j]=teclado.nextInt();
            }
        }

        System.out.println("que numero de columna  quiere mostrar");
        int columnas2 = teclado.nextInt(); //2

        /*if(columnas == columnas2){
            for (int i=0;i<matriz.length;i++){
                for (int j = 0; j <matriz.length ; j++) {
                    System.out.println("Valor: " + matriz[i][j]);
                }
            }
        }*/

        // Creamos arreglo nuevo y lo llenamos con la columna deseada
        int[] arregloAux = new int[fila];
        for (int i=0; i<arregloAux.length; i++){
            arregloAux[i] = matriz[i][columnas2];
        }

        //Mostramos la Matriz
        System.out.println("********************");
        for (int i=0;i<fila;i++){
            for (int j=0;j<columnas;j++){
                System.out.printf("%3d ", matriz[i][j]);
            }
            System.out.println();
        }

        //Mostramos el vector
        System.out.println("********************");
        System.out.println(Arrays.toString(arregloAux));
        System.out.println();

    }
}
