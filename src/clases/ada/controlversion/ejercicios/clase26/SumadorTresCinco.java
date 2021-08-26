package clases.ada.controlversion.ejercicios.clase26;

public class SumadorTresCinco {

    public static void main(String[] args) {
        System.out.println("INICIA METODO MAIN");
        final int TOPE = 1000;
        int resultado = sumarConFor(TOPE);
        System.out.println("Sumatoria: " + resultado);
        int multiplos3 = calculoConMatematicaPor(TOPE, 3);
        int multiplos5 = calculoConMatematicaPor(TOPE, 5);
        int multiplos15 = calculoConMatematicaPor(TOPE, 15);
        System.out.println("Sumatoria: " + (multiplos3 + multiplos5 - multiplos15));
        System.out.println("FINALIZA METODO MAIN");
    }

    private static int calculoConMatematicaPor(int tope, int num) {
        int result;
        int p = tope / num;
        result = num*(p*(p+1)) / 2;
        return result;
    }

    private static int sumarConFor(int tope) {
        System.out.println("INICIA METODO SUMAR_CON_FOR");
        int result = 0;
        for (int i = 0; i < tope; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        System.out.println("FINALIZA METODO SUMAR_CON_FOR");
        return result;
    }

}
