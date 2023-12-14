/**
 * Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
 * primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
 * primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
 * @author Adrián Rueda Fernández
 * @return Es un programa que crea dos arrays de enteros de tamaño 100. 
 * Luego, llena el primer array con valores del 1 al 100. Después, copia estos valores en orden inverso al segundo array y muestra ambos arrays.
 */

public class App4 {
    public static void main(String[] args) {
        int[] array1 = new int[100];
        int[] array2 = new int[100];

        for (int i = 0; i < 100; i++) {
            array1[i] = i + 1;
        }

        for (int i = 0; i < 100; i++) {
            array2[i] = array1[99 - i];
        }

        System.out.println("Array 1:");
        for (int value : array1) {
            System.out.print(value + " ");
        }

        System.out.println("\nArray 2 (inverso):");
        for (int value : array2) {
            System.out.print(value + " ");
        }
    }
}
