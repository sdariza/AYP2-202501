/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intromatrices;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class IntroMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar una matriz
        int A[][] = new int[100][100];
        int n = 0, m = 0;
        //Llenar elementos en la matriz:
        Scanner input = new Scanner(System.in);
        while (n < 1 || n > 100) {
            System.out.println("Ingrese la cantidad de filas");
            n = input.nextInt();
        }
        while (m < 1 || m > 100) {
            System.out.println("Ingrese la cantidad de columnas");
            m = input.nextInt();
        }
        System.out.println("Subíndices");
        for (int i = 0; i < n; i++) {//filas
            for (int j = 0; j < m; j++) {//columnas
                System.out.print(i + "," + j + "|");
            }
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {//filas
            for (int j = 0; j < m; j++) {//columnas
                System.out.println("Ingrese A[" + i + "," + j + "]");
                A[i][j] = input.nextInt();
            }
        }
        //Imprimo los elementos leídos
        for (int i = 0; i < n; i++) {//filas
            for (int j = 0; j < m; j++) {//columnas
                System.out.print(A[i][j] + "|");
            }
            System.out.println();
        }
    }
}
