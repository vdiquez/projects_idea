package clases.ada.fundamentosjava.clase25;

import java.util.Scanner;

public class Ejercicio06 {
    //E3 -> 6 Crea un programa que pida por pantalla cuatro países y a
    // continuación tres ciudades de cada uno de estos países. Los
    // nombres de ciudades deben almacenarse en un array multidimensional
    // cuyo primer índice sea el número asignado a cada país y el segundo
    // índice el número asignado a cada ciudad. Ejemplo de resultados que
    // debe mostrar el programa:
    //País: Argentina Ciudades: Buenos Aires Cordoba La Plata
    //País: España Ciudades: Madrid Lugo Sevilla
    //País: Francia Ciudades: Paris Niza Lyon
    //País: Italia Ciudades: Roma Napoles Sicilia

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] paises = new String[4];
        String[][] ciudades = new String[4][3];

        for (int i=0; i<paises.length; i++){
            System.out.println("Ingrese el pais en la posicion " + i);
            paises[i] = sc.nextLine();
        }
        System.out.println("************************");
        for (int i=0; i<ciudades.length; i++){
            for (int j=0; j<ciudades[i].length; j++){
                System.out.println("Ingrese una ciudad de " + paises[i]);
                ciudades[i][j] = sc.nextLine();
            }
        }
        System.out.println("************************");

        for (int i=0; i<ciudades.length; i++){
            System.out.print("\nPaís: "+ paises[i]+ " Ciudades: ");
            for (int j=0; j<ciudades[i].length; j++){
                System.out.print(ciudades[i][j] + " ");
            }
        }
    }


}
