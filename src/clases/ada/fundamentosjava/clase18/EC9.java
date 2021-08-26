package clases.ada.fundamentosjava.clase18;
import java.util.Scanner;

public class EC9 {
    /*
    9.	Una compañía de seguros para autos ofrece dos tipos de póliza: cobertura amplia (A) y daños a
     terceros (B). Para el plan A, la cuota base es de $1,200, y para el B, de $950. A ambos planes se
      les carga 10% del costo si la persona que conduce tiene por hábito beber alcohol, 5% si utiliza
       lentes, 5% si padece alguna enfermedad –como de- ficiencia cardiaca o diabetes–, y si tiene más
       de 40 años, se le carga 20%, de lo contrario sólo 10%. Todos estos cargos se realizan sobre el
       costo base. Realice diagrama de flujo que represente el algoritmo para determinar cuánto le cuesta
        a una persona contratar una póliza.
     */
    public static void main(String[] args) {

        final int CUOTA_BASE_PLAN_A = 1200;
        final int CUOTA_BASE_PLAN_B = 950;
        final float INTERES_POR_SER_BEBEDOR = 0.1f;// 10%
        final float INTERES_POR_USAR_LENTES = 0.05f;// 5%
        final float INTERES_POR_ENFERMEDAD = 0.05f;// 5%
        final float INTERES_POR_SER_MAYOR_DE_CUARENTA = 0.2f;// 20%
        final float INTERES_POR_SER_MENOR_DE_CUARENTA = 0.1f;// 20%

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca el numero del plan que desee: ");
        System.out.println("0. Cobertura amplia (A)");
        System.out.println("1. Daños a Terceros (B)");
        byte planAsegurado = lector.nextByte();

        System.out.println("Marque la opción correcta: ");
        System.out.println("0. Usted bebe alcohol");
        System.out.println("1. Usted no bebe alcohol");
        byte habitoBebedor = lector.nextByte();

        System.out.println("Marque la opción correcta: ");
        System.out.println("0. Usted usa lentes");
        System.out.println("1. Usted no usa lentes");
        byte condicionVista = lector.nextByte();

        System.out.println("Marque la opción correcta: ");
        System.out.println("0. Usted padece de enferdedades como: Deficiencia Cardiaca o Diabetes");
        System.out.println("1. Usted no posee estas enfermedades");
        byte condicionEnfermedad = lector.nextByte();

        System.out.println("Marque la opción correcta: ");
        System.out.println("0. Usted tiene mas de 40 años");
        System.out.println("1. Usted tiene 40 años o menos");
        byte edadAsegurado = lector.nextByte();

        float interesPorEdad;

        if (edadAsegurado == 0) {
            interesPorEdad = INTERES_POR_SER_MAYOR_DE_CUARENTA;
        } else {
            interesPorEdad = INTERES_POR_SER_MENOR_DE_CUARENTA;
        }

        float intereses = habitoBebedor*INTERES_POR_SER_BEBEDOR + condicionVista*INTERES_POR_USAR_LENTES
                + condicionEnfermedad*INTERES_POR_ENFERMEDAD + interesPorEdad;

        float montoAPagarPorAsegurado;

        if (planAsegurado == 0) {
            montoAPagarPorAsegurado = (intereses+1)*CUOTA_BASE_PLAN_A;
        } else {
            montoAPagarPorAsegurado = (intereses+1)*CUOTA_BASE_PLAN_B;
        }

        System.out.printf("La cuota a pagar por el asegurado es de: %.2f", montoAPagarPorAsegurado);

    }
}
