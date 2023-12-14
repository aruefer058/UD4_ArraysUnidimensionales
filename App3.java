/**
 * Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
 * Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado.
 * Luego mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
 * por debajo de la media.
 * @author Adrián Rueda Fernández
 * @return Es un programa que este programa pide al usuario el número de alturas N. 
 * Luego, solicita y almacena en un array las alturas de N personas. Después, calcula la altura media, máxima y mínima, así como cuántas personas están por encima y por debajo de la media.
 */

public class App3 {
    public static void main(String[] args) {
        String input = System.console().readLine("Ingrese el número de alturas (N): ");
        int n = Integer.parseInt(input);

        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            input = System.console().readLine("Ingrese la altura " + (i + 1) + " en metros: ");
            alturas[i] = Double.parseDouble(input);
        }

        double suma = 0;
        double max = alturas[0];
        double min = alturas[0];

        for (double altura : alturas) {
            suma += altura;
            if (altura > max) {
                max = altura;
            }
            if (altura < min) {
                min = altura;
            }
        }

        double media = suma / n;

        int countAbove = 0;
        int countBelow = 0;

        for (double altura : alturas) {
            if (altura > media) {
                countAbove++;
            } else if (altura < media) {
                countBelow++;
            }
        }

        System.out.println("Altura media: " + media);
        System.out.println("Altura máxima: " + max);
        System.out.println("Altura mínima: " + min);
        System.out.println("Personas por encima de la media: " + countAbove);
        System.out.println("Personas por debajo de la media: " + countBelow);
    }
}
