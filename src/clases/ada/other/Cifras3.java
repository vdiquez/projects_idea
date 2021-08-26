package clases.ada.clase22;

import java.util.Scanner;

/*Programa que lea dos variables enteras N y m y
le quite a N sus m últimas cifras.
Ejemplo, si N = 123456 y m = 2 el nuevo valor de N
será 1234.
*/
public class Cifras3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m, nuevoValor;
        System.out.println("Hola, ingrese un número entero");
        n = sc.nextInt();
        System.out.println("Hola, ingrese la cantidad de cifras que quiere quitarle al número anterior");
        m = sc.nextInt();
        nuevoValor =  sacarCifras(n, m);
        System.out.println("El nuevo número es: "+nuevoValor);
        sc.close();
    }
    public static int sacarCifras(int n,int m){
        int divisorInt = (int)Math.pow(10,m);
        return n / divisorInt;
    }
}
