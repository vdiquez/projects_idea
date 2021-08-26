package clases.ada.fundamentosjava.entregados;

import java.util.Scanner;

public class Ej21ValentinaGanzarain {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double  saldoActual, pagoMinimoactual, pagoNogenerandointereses, saldoAnterior, montoCompras, pagoCorteanterior,
                pagoMinimo, interesAcumulado, multaPorpagomenoralminimo;

        System.out.println("Ingrese el saldo anterior del cliente: ");
        saldoAnterior = lector.nextFloat();
        System.out.println("Ingrese el monto total de las compras que realizo: ");
        montoCompras = lector.nextFloat();
        System.out.println("Ingrese el pago que deposito en el corte anterior:");
        pagoCorteanterior = lector.nextFloat();

        pagoMinimo = saldoAnterior * 0.15;

        if (pagoCorteanterior > pagoMinimo) {
            interesAcumulado = 0;
            multaPorpagomenoralminimo = 0;
        } else {
            interesAcumulado =  saldoAnterior * 0.12;
            multaPorpagomenoralminimo = 200;
        }

        saldoActual = saldoAnterior + montoCompras + interesAcumulado + multaPorpagomenoralminimo - pagoCorteanterior;
        pagoMinimoactual = saldoActual * 0.15;
        pagoNogenerandointereses = saldoActual * 0.85;

        System.out.println("Valor de pago minimo: " + pagoMinimoactual);
        System.out.println("Valor de pago para no generar intereses: " + pagoNogenerandointereses);
        System.out.println("Valor del saldo actual: " + saldoActual);

    }
}
