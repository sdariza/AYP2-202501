/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introprocedimientos;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class IntroProcedimientos {

    //Subs--> void
    //funciones --> dependen del valor a retornar
    static Scanner input = new Scanner(System.in);

    static void leerMatriz(int n, int m, int M[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Ingrese la pos: " + i + "," + j);
                M[i][j] = input.nextInt();
            }
        }
    }

    static void impMatriz(int n, int m, int M[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(M[i][j] + "|");
            }
            System.out.println();
        }
    }

    static void sumRestMatriz(int n, int m, int M1[][], int M2[][], int signo, int R[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                R[i][j] = M1[i][j] + signo * M2[i][j];
            }
        }
    }

    static void transpuesta(int n, int m, int M[][], int R[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                R[j][i] = M[i][j];
            }
        }
    }

    static void multMatrices(int n, int m, int M1[][], int M2[][], int R[][]) {
        int sum;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum = 0;
                for (int k = 0; k < 10; k++) {
                    sum = sum + M1[i][k] * M2[k][j];
                }
                R[i][j] = sum;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Inicio
        int n = 0, m = 0;
        int A[][] = new int[100][100], B[][] = new int[100][100];
        int C[][] = new int[100][100], D[][] = new int[100][100], E[][] = new int[100][100];
        while (n <= 0) {
            System.out.println("Ingresa n: ");
            n = input.nextInt();
        }
        while (m <= 0) {
            System.out.println("Ingresa n: ");
            m = input.nextInt();
        }
        leerMatriz(n, m, A);
        leerMatriz(n, m, B);
        System.out.println("Matriz A");
        impMatriz(n, m, A);
        System.out.println("Matriz B");
        impMatriz(n, m, B);
        sumRestMatriz(n, m, A, B, 1, C);
        transpuesta(n, m, C, D);
        multMatrices(n, m, D, B, E);
        System.out.println("(A+B)^tB");
        impMatriz(n, n, E);
    }

}
