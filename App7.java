/**
 * Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
 * valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
 * muestre por pantalla.
 * @author Adrián Rueda Fernández
 * @return Es un programa que crea un array de 100 enteros siguiendo una secuencia específica: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc., 
 * hasta llegar a 10 diez veces. Luego, muestra este array. 
 * La secuencia consiste en repetir el valor actual un número de veces igual al valor mismo.
 */

public class App7 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int valor = 1;
        int repeticiones = 10;
        int index = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < repeticiones; j++) {
                array[index] = valor;
                index++;
            }
            valor++;
            repeticiones--;
        }

    }
}