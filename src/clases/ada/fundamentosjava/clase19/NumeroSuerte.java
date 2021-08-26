package clases.ada.fundamentosjava.clase19;

public class NumeroSuerte {
    public static void main(String[] args) {
        int numero = 1985;
        int numeroSuerte = 0;
        int unidad;

        while (numero > 0) {
            unidad = numero % 10;
            numeroSuerte += unidad;
            numero = numero/10;
            System.out.println(numeroSuerte);
            System.out.println(numero);
        }

        System.out.println("Su numero de la suerte es: " + numeroSuerte);

    }
}
