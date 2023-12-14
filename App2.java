/**
 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
 * enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
 * mostrará en qué posiciones del array aparece N.
 * @author Adrián Rueda Fernández
 * @return Es un programa que crea un array de 100 enteros, cada uno generado aleatoriamente entre 1 y 10. 
 * Luego, solicita al usuario un valor N y muestra las posiciones en las que ese valor aparece en el array.
 */

public class App2 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            array[i] = (int) (1 + Math.random() * 10);
        }

        String input = System.console().readLine("Ingrese un valor N: ");
        int n = Integer.parseInt(input);

        System.out.print("Posiciones en las que aparece N: ");
        for (int i = 0; i < 100; i++) {
            if (array[i] == n) {
                System.out.print(i + " ");
            }
        }
    }
}
