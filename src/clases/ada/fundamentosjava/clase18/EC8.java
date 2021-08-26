package clases.ada.fundamentosjava.clase18;

import java.util.Scanner;

/*
Cierta empresa proporciona un bono mensual a sus trabajadores, el cual puede ser por
su antigüedad o bien por el monto de su sueldo (el que sea mayor), de la siguiente
forma:
Cuando la antigüedad es mayor a 2 años pero menor a 5, se otorga 20 % de su sueldo;
cuando es de 5 años o más, 30 %. Ahora bien, el bono por concepto de sueldo, si éste es
menor a $1000, se da 25 % de éste, cuando éste es mayor a $1000, pero menor o igual a
$3500, se otorga 15% de su sueldo, para más de $3500. 10%.
 */
public class EC8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la antiguedad: ");
        int antiguedad = lector.nextInt();
        System.out.println("Ingrese el monto del sueldo");
        float sueldo = lector.nextFloat();
        float totalSueldo;

        if (antiguedad > sueldo && antiguedad > 2 && antiguedad < 5) {
            totalSueldo = sueldo + (sueldo * 0.20f);
            System.out.println("Su bono va a ser de: " + totalSueldo);
        } else if (antiguedad >= 5) {
            totalSueldo = sueldo + (sueldo * 0.30f);
            System.out.println("Su bono va a ser de: " + totalSueldo);
        } else if (antiguedad < sueldo && sueldo < 1000) {
            totalSueldo = sueldo + (sueldo * 0.25f);
            System.out.println("Su bono va a ser de: " + totalSueldo);
        } else if (sueldo > 1000 && sueldo <= 3500) {
            totalSueldo = sueldo + (sueldo * 0.15f);
            System.out.println("Su bono va a ser de: " + totalSueldo);
        } else {
            totalSueldo = sueldo + (sueldo * 0.10f);
            System.out.println("Su bono va a ser de: " + totalSueldo);
        }
    }

}

