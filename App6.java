/**
 * Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y
 * luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un
 * valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería
 * 1, 3, 5, 7, 9... Con V=7 e I=10, la secuencia sería 7, 17, 27, 37... El programa solicitará al
 * usuario V, I además de N (no de valores a crear).
 * @author Adrián Rueda Fernández
 * @return Es un programa que solicita al usuario un valor inicial V, un incremento I y el número de valores N. 
 * Luego, crea un array de tamaño N que contiene una secuencia aritmética generada con el valor inicial y el incremento proporcionados. 
 * Finalmente, muestra la secuencia aritmética.
 */

public class App6 {
    public static void main(String[] args) {
        String input = System.console().readLine("Ingrese el valor inicial V: ");
        int v = Integer.parseInt(input);

        input = System.console().readLine("Ingrese el incremento I: ");
        int i = Integer.parseInt(input);

        input = System.console().readLine("Ingrese el número de valores N: ");
        int n = Integer.parseInt(input);

        int[] secuencia = new int[n];

        for (int j = 0; j < n; j++) {
            secuencia[j] = v + j * i;
        }

        System.out.print("Secuencia aritmética: ");
        for (int value : secuencia) {
            System.out.print(value + " ");
        }
    }
}

