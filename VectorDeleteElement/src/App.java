import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        /* Lectura del vector */
        int n = 0;
        int vec[] = new int[100];
        while (n < 1 || n > 100) {
            System.out.println("Ingresa la dimensión del vector: ");
            n = input.nextInt();
        }
        int i;
        for (i = 0; i < n; i++) {
            System.out.printf("Ingresa vec[%d]\n", i);
            vec[i] = input.nextInt();
        }
        System.out.println("El vector leído es: ");
        for (i = 0; i < n; i++) {
            System.out.printf("%d|", vec[i]);
        }
        System.out.println();
        /* Algoritmo de búsqueda secuencial */
        System.out.println("Ingrese el elemento a buscar: ");
        int x = input.nextInt();
        input.close();
        boolean encontrado = false;
        i = 0;
        while (!encontrado && i <= n - 1) {
            if (vec[i] == x) {
                encontrado = true;
            } else {
                i++;
            }
        }
        if (!encontrado) {
            System.out.println("Elemento no encontrado");
        } else {
            i = i + 1;
            System.out.printf("Es el elemento número: %d\n", i);
            // caso 1: elemento en última posición
            if (i == n - 1) {
                vec[i] = 0;
            } else {// caso 2: el elemento NO está de último
                for (int j = i - 1; j <= n - 2; j++) {// traladar todos los elementos desde la posición donde se
                                                      // encontró
                    vec[j] = vec[j + 1];
                }
                vec[n - 1] = 0;
            }
            n--;
            System.out.println("El vector resultante es :");
            for (i = 0; i < n; i++) {
                System.out.printf("%d|", vec[i]);
            }
            System.out.println();
        }

    }
}
