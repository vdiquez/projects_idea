package clases.ada.fundamentosjava.entregados;

import java.util.Scanner;

/*El banco “Bandido de peluche” desea calcular para uno de sus clientes el saldo actual, el pago mínimo y el pago para
no generar intereses. Los datos que se conocen son: saldo anterior del cliente, monto de las compras que realizó y el
pago que depositó en el corte anterior. Para calcular el pago mínimo se debe considerar 15% del saldo actual, y para
no generar intereses corresponde 85% del saldo actual, considerando que este saldo debe incluir 12% de los intereses
causados por no realizar el pago mínimo y $200 por multa por el mismo motivo.
*/
public class Ejercicio21AlejandraBravo {
    public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);
    double pagoMinimoAnterior, multaPorPagoMenorAlMinimo, saldoAnterior,
                saldoActual, pagoMinimoActual, pagoParaNoGenerarInteres, montoTotalCompras, pagoCorteAnterior,
                interesAcumulado;

        System.out.println("Introduzca el valor del saldo anterior del cliente: ");
        saldoAnterior=datos.nextDouble();
        System.out.println("Introduza el monto total de las compras que realizó en este mes: ");
        montoTotalCompras=datos.nextDouble();
        System.out.println("Introduzca el valor del pago que realizó en el corte anterior: ");
        pagoCorteAnterior=datos.nextDouble();
        pagoMinimoAnterior= saldoAnterior * 0.15;
        if (pagoCorteAnterior > pagoMinimoAnterior) {
            interesAcumulado=0;
            multaPorPagoMenorAlMinimo=0;
        }else {
            interesAcumulado=saldoAnterior*0.12;
            multaPorPagoMenorAlMinimo=200;
        }
        saldoActual=saldoAnterior + montoTotalCompras + interesAcumulado + multaPorPagoMenorAlMinimo - pagoCorteAnterior;
        pagoMinimoActual = saldoActual * 0.15;
        pagoParaNoGenerarInteres= saldoActual * 0.85;
        System.out.println("Valor de pago mínimo: $" + pagoMinimoActual);
        System.out.println("Valor de pago para no generar intereses: $" + pagoParaNoGenerarInteres);
        System.out.println("Valor del saldo actual: $" + saldoActual);

    }
}
