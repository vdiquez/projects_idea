package clases.ada.fundamentosjava.clase21;

import java.util.Scanner;

/*
Una compañía de transporte cuenta con cinco choferes, de los cuales se conoce: nombre,
horas trabajadas cada día de la semana (seis días) y sueldo por hora. Realice un algoritmo que:
-Calcule el total de horas trabajadas a la semana para cada trabajador.
-Calcule el sueldo semanal para cada uno de ellos.
-Calcule el total que pagará la empresa.
-Indique el nombre del trabajador que labora más horas el día lunes.
-Imprima un reporte con todos los datos anteriores.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        String[] diasDescripcion = {"Lunes", "Martes","Miércoles","Jueves","Viernes","Sábado"};
        final int CANT_TRABAJADORES = 5;
        int[] totalHorasTrabajadas = new int[CANT_TRABAJADORES];
        final int LUNES = 0;
        String[] nombres = new String[CANT_TRABAJADORES];
        int[][] horasTrabajadasPorCadaDia = new int[CANT_TRABAJADORES][6];
        float[] sueldoPorHora = new float[CANT_TRABAJADORES];

        int mayorCantHorasLunes = 1000;
        String nombreMasTrabajadorLunes = "";

        for (int trabajador = 0; trabajador < CANT_TRABAJADORES; trabajador++) {
            System.out.printf("Introduzca el nombre del trabajador %d:",trabajador+1);
            nombres[trabajador] = escaner.nextLine();

            for (int dias = 0; dias < diasDescripcion.length; dias++) {
                System.out.printf("Introduzca la cantidad de horas que trabajó el día %s: ",diasDescripcion[dias]);
                horasTrabajadasPorCadaDia[trabajador][dias] = escaner.nextInt();
                totalHorasTrabajadas[trabajador] += horasTrabajadasPorCadaDia[trabajador][dias];
            }
            System.out.printf("Introduzca el sueldo por hora del trabajador %d:",trabajador+1);
            sueldoPorHora[trabajador] = escaner.nextFloat();
            escaner.nextLine();

            if (mayorCantHorasLunes < horasTrabajadasPorCadaDia[trabajador][LUNES]) {
                mayorCantHorasLunes = horasTrabajadasPorCadaDia[trabajador][LUNES];
                nombreMasTrabajadorLunes = nombres[trabajador];
            }

        }

        float totalAPagarPorEmpresa = 0;
        for (int trabajador = 0; trabajador < CANT_TRABAJADORES; trabajador++) {
            System.out.printf("Las horas trabajadas por %s son %d \n", nombres[trabajador], totalHorasTrabajadas[trabajador]);
            System.out.printf("El sueldo semanal de %s es de %.2f \n", nombres[trabajador], (sueldoPorHora[trabajador] * totalHorasTrabajadas[trabajador]));
            totalAPagarPorEmpresa += (sueldoPorHora[trabajador] * totalHorasTrabajadas[trabajador]);
        }
        System.out.printf("El total a pagar por la empresa es %.2f \n", totalAPagarPorEmpresa);
        System.out.printf("El trabajador mas fajado del lía lunes fue: %s \n", nombreMasTrabajadorLunes);
    }

}

