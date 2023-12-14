/**
 * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
 * distintas opciones:
 * a. Mostrar valores.
 * b. Introducir valor.
 * c. Salir.
 * La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
 * posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente
 * hasta que el usuario elija la opción ‘c’ que terminará el programa.
 * @author Adrián Rueda Fernández
 * @return Es un programa que presenta un menú con tres opciones: mostrar valores, introducir valor y salir. 
 * Si el usuario elige mostrar valores, se imprimen los valores del array. 
 * Si elige introducir valor, se le pide un valor y una posición, y se guarda el valor en esa posición del array. 
 * El programa se repite hasta que el usuario elige salir.
 */

public class App5 {
    public static void main(String[] args) {
        int[] array = new int[10];

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("a. Mostrar valores.");
            System.out.println("b. Introducir valor.");
            System.out.println("c. Salir.");

            String opcion = System.console().readLine("Seleccione una opción (a, b o c): ");

            switch (opcion) {
                case "a":
                    mostrarValores(array);
                    break;
                case "b":
                    introducirValor(array);
                    break;
                case "c":
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    private static void mostrarValores(int[] array) {
        System.out.print("Valores del array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static void introducirValor(int[] array) {
        String input = System.console().readLine("Ingrese un valor V: ");
        int v = Integer.parseInt(input);

        input = System.console().readLine("Ingrese una posición P: ");
        int p = Integer.parseInt(input);

        if (p >= 0 && p < array.length) {
            array[p] = v;
        } else {
            System.out.println("Posición no válida. Inténtelo de nuevo.");
        }
    }
}
