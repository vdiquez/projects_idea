package clases.ada.fundamentosjava.clase19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EjemploBufferedReader {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
        Scanner escaner = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");//Se pide un dato al usuario

        String nombre = null; //Se lee el nombre con readLine() que retorna un String con el dato
        try {
            nombre = br.readLine();
            System.out.println("Bienvenido " + nombre + ". Por favor ingrese su edad");//Se pide otro dato al usuario

            //Nótese que readLine siempre retorna String y la clase BufferedReader...
            //no tiene un método para leer enteros, así que debemos convertirlo.

            String entrada = br.readLine(); //Se guarda la entrada (edad) en una variable
            int edad = Integer.parseInt(entrada);//Se transforma la entrada anterior en un entero
            //Si el usuario ingresó solo números funcionará bien, de lo contrario generará una excepción

            System.out.println("Gracias " + nombre + " en 10 años usted tendrá " + (edad + 10) + " años."); //Operacion numerica con la edad
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
