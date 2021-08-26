package clases.ada.fundamentosjava.entregados;

import java.util.Scanner;

public class Ej_21_GulloMariaLaura {

	/*
	 * El banco "Bandido de peluche" desea calcular para uno de sus clientes el
	 * saldo actual, el pago m�nimo y el pago para no generar intereses. Los datos
	 * que se conocen son: saldo anterior del cliente, monto de las compras que
	 * realiz� y el pago que deposit� en el corte anterior. Para calcular el pago
	 * m�nimo se debe considerar 15% del saldo actual, y para no generar intereses
	 * corresponde 85% del saldo actual, considerando que este saldo debe incluir
	 * 12% de los intereses causados por no realizar el pago m�nimo y $200 por multa
	 * por el mismo motivo. Realice el algoritmo correspondiente y repres�ntelo
	 * mediante el diagrama de flujo y pseudoc�digo.
	 */

	public static void main(String[] args) {

		float saldoAnterior, compras, pagoAnterior, pagoMinimo = 0, saldoActual = 0, pagoSinInteres = 0, intereses = 0;
		int multa = 0;

		System.out.println("Ingrese el saldo anterior");
		Scanner lector = new Scanner(System.in);
		saldoAnterior = lector.nextFloat();
		System.out.println("Ingrese el pago realizado");
		pagoAnterior = lector.nextFloat();

		pagoMinimo = saldoAnterior * 0.15f;

		if (pagoAnterior < pagoMinimo) {
			intereses = saldoAnterior * 0.12f;
			multa = 200;
		}

		System.out.println("Ingrese el monto de las compras realizadas");
		compras = lector.nextFloat();

		saldoActual = saldoAnterior + compras + multa + intereses - pagoAnterior;
		pagoMinimo = saldoActual * 0.15f;
		pagoSinInteres = saldoActual * 0.85f;

		System.out.printf("El saldo actual es: $ %.2f \nEl pago m�nimo es: $ %.2f \nEl pago sin intereses es: $ %.2f",
				saldoActual, pagoMinimo, pagoSinInteres);
	}
}
