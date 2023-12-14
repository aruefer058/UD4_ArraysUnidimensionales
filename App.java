/**
 * Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
 * utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
 * cuántos valores del array son igual o superiores a R.
 * @author Adrián Rueda Fernández
 * @return Es un programa que crea un array de 100 números reales aleatorios entre 0.0 y 1.0 utilizando Math.random(). 
 * Luego, solicita al usuario un valor real R y cuenta cuántos valores en el array son iguales o superiores a R, mostrando este resultado.
 */

public class App {
    public static void main(String[] args) {
        double[] numeros = new double[100];

        for (int i = 0; i < 100; i++) {
            numeros[i] = Math.random();
        }

        String input = System.console().readLine("Ingrese un valor real R: ");
        double r = Double.parseDouble(input);

        int count = 0;
        for (double num : numeros) {
            if (num >= r) {
                count++;
            }
        }

        System.out.println("Cantidad de valores igual o superiores a R: " + count);
    }
}
