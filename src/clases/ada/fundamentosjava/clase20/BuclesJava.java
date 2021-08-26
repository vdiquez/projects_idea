package clases.ada.fundamentosjava.clase20;

import java.util.ArrayList;
import java.util.List;

public class BuclesJava {
    public static void main(String[] args) {
        System.out.println("Tabla de multiplicar del 5");
        for (int i = 0; i <= 10; i++) {
            System.out.println(5 + " * " + i + " = " + 5 * i);
        }

        //System.out.println(5 + "");//Conversion incorrecta
        //System.out.println(String.valueOf(5));//Conversion correcta

        int salirBucleInfinito = 0;
        //Este for no se debe utilizar por ser un bucle infinito
        for (; ; ) {
            System.out.println("Estoy en For: " + salirBucleInfinito);
            if (salirBucleInfinito > 20) {
                break;
            }
            salirBucleInfinito++;
        }

        int x = 2;
        for (long y = 0, z = 4; x < 10 && y < 10; x++, y++) {
            System.out.println(y + " ");
        }

        // x es integer
        int numeroEntero;
        long numeroEnteroGrande;

        // redeclarando x como long no trabajará
        for (numeroEnteroGrande = 0, numeroEntero = 6; x < 5; x++) {
            System.out.print(x + " ");
        }

        List<String> nombres = new ArrayList<>();
        nombres.add("Nombre1");
        nombres.add("Nombre2");
        nombres.add("Nombre3");
        nombres.add("Nombre4");
        nombres.add("Nombre5");
        nombres.add("Nombre6");

        for (String nombre : nombres) {
            System.out.println("Cosas en la lista ForEach: " + nombre);
        }

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Cosas en la lista FORi: " + nombres.get(i));
        }

        salirBucleInfinito = 0;
        while (true) {
            System.out.println("Estoy en While: " + salirBucleInfinito);
            if (salirBucleInfinito > 20) {
                break;
            }
            salirBucleInfinito++;
        }

        while (true) {
            System.out.println("Estoy en While: " + salirBucleInfinito);
            if (salirBucleInfinito > 20) {
                break;
            }
            salirBucleInfinito++;
        }

        int entero = 4;
        do {
            System.out.println("Estoy en Do While: " + entero);
            entero++;
        } while (entero == 7);

        entero = 4;
        do {
            System.out.println("Estoy en Do While 2: " + entero);
            entero++;
        } while (entero < 7);

    }
}
