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
        if (encontrado) {
            System.out.printf("Es el elemento número: %d", i++);
        } else {
            System.out.println("Elemento no encontrado");
        }

    }
}
