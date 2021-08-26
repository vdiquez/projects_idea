package clases.ada.fundamentosjava.entregados;

import java.util.Scanner;

public class Ejercicio21Elizabeth {
    public static void main(String[] args) {
        double pagoMinimoAnterior, interesAcumulado, multaPorPagoMenorAlMinimo;
        double saldoActual, pagoMinimoActual, pagoParaNoGenerarIntereses;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor del saldo anterior del cliente: ");
        double saldoAnterior = sc.nextDouble();
        System.out.println("Introduzca el monto total de las compras que realizó: ");
        double montoTotalComprasRealizadas = sc.nextDouble();
        System.out.println("Introduzca el valor del pago que realizó en el corte anterior: ");
        double pagoCorteAnterior = sc.nextDouble();
        sc.close();
        pagoMinimoAnterior = saldoAnterior * 0.15;
        if(pagoCorteAnterior > pagoMinimoAnterior){
            interesAcumulado = 0;
            multaPorPagoMenorAlMinimo = 0;
        }else{
            interesAcumulado = saldoAnterior * 0.12;
            multaPorPagoMenorAlMinimo = 200;
        }
        saldoActual = saldoAnterior + montoTotalComprasRealizadas + interesAcumulado + multaPorPagoMenorAlMinimo - pagoCorteAnterior;
        pagoMinimoActual = saldoActual * 0.15;
        pagoParaNoGenerarIntereses = saldoActual * 0.85;
        System.out.println("Valor de pago minimo: "+pagoMinimoActual);
        System.out.println("Valor de pago para no generar intereses: "+pagoParaNoGenerarIntereses);
        System.out.println("Valor de saldo actual: "+saldoActual);
    }
}
