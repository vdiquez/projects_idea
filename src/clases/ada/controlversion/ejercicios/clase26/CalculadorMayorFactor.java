package clases.ada.controlversion.ejercicios.clase26;

public class CalculadorMayorFactor {

        public static void main(String[] args) {
            encontrarFactores(600851475143L);
        }

        private static boolean encontrarFactores(long numero) {
            for (long divisor = numero; divisor > 1; divisor--) {
                if (esNumeroPrimo(divisor) && esDivisor(numero, divisor)) {
                    System.out.printf("%4d|%3d\n", numero, divisor);
                    encontrarFactores(numero / divisor);
                    return true;
                }
            }
            System.out.printf("%4d|\n\n", 1);
            return false;
        }

        private static boolean esNumeroPrimo(long numero) {
            if (numero < 2)
                return false;
            for (long divisor = 2; divisor < numero; divisor++) {
                if (numero % divisor == 0)
                    return false;
            }
            return true;
        }

        private static boolean esDivisor(long numero, long divisor) {
            return numero % divisor == 0;
        }
}
