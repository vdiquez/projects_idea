package clases.ada.fundamentosjava.entregados;

import java.util.Scanner;
/*
21.	El banco “Bandido de peluche” desea calcular para uno de sus clientes el saldo actual, el pago mínimo y el pago
para no generar intereses. Los datos que se conocen son: saldo anterior del cliente, monto de las compras que realizó
y el pago que depositó en el corte anterior. Para calcular el pago mínimo se debe considerar 15% del saldo actual,
y para no generar intereses corresponde 85% del saldo actual, considerando que este saldo debe incluir 12% de los
intereses causados por no realizar el pago mínimo y $200 por multa por el mismo motivo. Realice el algoritmo
correspondiente y represéntelo mediante el diagrama de flujo y pseudocódigo.
 */

public class Ejercicio2_21GabrielaSoruco {
    public static void main(String[] args) {

        float saldoAnterior, montoCompras, pagoCorteAnterior;
        float pagoMinimoAnterior, interesAcumulado, multaPorPagoMenorAlMinimo;
        float saldoActual, pagoMinimoActual, pagoParaNoGenerarIntereses;

        Scanner lector = new Scanner(System.in);
        System.out.println("******** BANCO BANDIDO DE PELUCHE ********");
        System.out.print("\nIntroduzca el valor del saldo anterior del cliente: ");
        saldoAnterior = lector.nextFloat();
        System.out.print("Introduzca el monto total de las compras que realizó: ");
        montoCompras = lector.nextFloat();
        System.out.print("Introduzca el valor del pago que realizó en el corte anterior: ");
        pagoCorteAnterior = lector.nextFloat();
        pagoMinimoAnterior = saldoAnterior * 0.15f;
        if (pagoCorteAnterior > pagoMinimoAnterior){
            interesAcumulado = 0;
            multaPorPagoMenorAlMinimo = 0;
        } else {
            interesAcumulado = saldoAnterior * 0.12f;
            multaPorPagoMenorAlMinimo = 200;
        }
        saldoActual = saldoAnterior + montoCompras + interesAcumulado + multaPorPagoMenorAlMinimo - pagoCorteAnterior;
        pagoMinimoActual = saldoActual * .15f;
        pagoParaNoGenerarIntereses = saldoActual * .85f;
        System.out.println("------------- RESUMEN -------------");
        System.out.printf("Valor de pago mínimo: %.2f", pagoMinimoActual);
        System.out.printf("\nValor de pago para no generar intereses: %.2f", pagoParaNoGenerarIntereses);
        System.out.printf("\nValor de saldo actual: %.2f", saldoActual);
    }
}
