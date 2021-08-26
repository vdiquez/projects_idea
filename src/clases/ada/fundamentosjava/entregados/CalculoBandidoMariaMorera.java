package clases.ada.fundamentosjava.entregados;

import java.util.Scanner;

public class CalculoBandidoMariaMorera {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double pagoMinimoAnterior, pagoCorteAnterior, interesAcumulado, multaPorPagoMenorAlMinimo, saldoAnterior;
        double saldoActual, pagoMinimoActual, pagoParaNoGenerarIntereses, montoTotalComprasRealizadas;

        System.out.println("Introduzca el valor del saldo anterior del cliente; ");
        saldoAnterior = lector.nextInt();

        System.out.println("Introduzca el monto total de las compras que realizo: ");
        montoTotalComprasRealizadas = lector.nextInt();

        System.out.println("Introduzca el valor del pago que realizo en el corte anterior");
        pagoCorteAnterior = lector.nextInt();

        pagoMinimoAnterior = saldoAnterior * 0.15;

        if (pagoCorteAnterior > pagoMinimoAnterior) {
            interesAcumulado = 0;
            multaPorPagoMenorAlMinimo = 0;
        } else {
            interesAcumulado = saldoAnterior * 0.12;
            multaPorPagoMenorAlMinimo = 200;
        }
        saldoActual = saldoAnterior + montoTotalComprasRealizadas + interesAcumulado + multaPorPagoMenorAlMinimo - pagoCorteAnterior;
        pagoMinimoActual = saldoActual * 0.15;
        pagoParaNoGenerarIntereses = saldoActual * 0.85;

        System.out.println("Valor de pago minimo: "+ pagoMinimoActual) ;
        System.out.println("Valor de pago para no generar intereses: " + pagoParaNoGenerarIntereses);
        System.out.println("Valor de saldo actual" + saldoActual);
    }



}
