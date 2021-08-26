package clases.ada.fundamentosjava.entregados;
/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CALCULO_BANDIDO.java."

import java.io.*;

public class CalculoBandidoVeronicaSalvarreguy {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double interesacumulado;
		double montototalcomprasrealizadas;
		double multaporpagomenoralminimo;
		double pagocorteanterior;
		double pagominimoactual;
		double pagominimoanterior;
		double pagoparanogenerarintereses;
		double saldoactual;
		double saldoanterior;
		System.out.println("Introduzca el valor del saldo anterior del cliente: ");
		saldoanterior = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Introduzca el monto total de las compras que realizó: ");
		montototalcomprasrealizadas = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Introduzca el valor del pago que realizó en el corte anterior: ");
		pagocorteanterior = Double.parseDouble(bufEntrada.readLine());
		pagominimoanterior = saldoanterior*0.15;
		if (pagocorteanterior>pagominimoanterior) {
			interesacumulado = 0;
			multaporpagomenoralminimo = 0;
		} else {
			interesacumulado = saldoanterior*0.12;
			multaporpagomenoralminimo = 200;
		}
		saldoactual = saldoanterior+montototalcomprasrealizadas+interesacumulado+multaporpagomenoralminimo-pagocorteanterior;
		pagominimoactual = saldoactual*0.15;
		pagoparanogenerarintereses = saldoactual*0.85;
		System.out.println("Valor de pago minimo: "+pagominimoactual);
		System.out.println("Valor de pago para no generar intereses: "+pagoparanogenerarintereses);
		System.out.println("Valor de saldo actual: "+saldoactual);
	}


}

