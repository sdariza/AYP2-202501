import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        /* Lectura de un vector con n elementos */
        int vec[] = new int[100], n = 0;
        while (n < 1 || n > 100) {
            System.out.println("Ingrese n");
            n = input.nextInt();
        }
        for (int i = 0; i <= n - 1; i++) {
            System.out.println("Ingrese el valor en v[" + i + "]");
            vec[i] = input.nextInt();
        }
        System.out.println(vec);
        /* Escritura de un vector con n elementos */
        System.out.println("El vector leído es: ");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(vec[i] + "|");
        }
        System.out.println();
        input.close();
    }
}
