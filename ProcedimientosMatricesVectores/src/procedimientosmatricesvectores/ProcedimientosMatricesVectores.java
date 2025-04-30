/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procedimientosmatricesvectores;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class ProcedimientosMatricesVectores {

    // void --> sub
    // tipo de dato para funciones
    static Scanner input = new Scanner(System.in);

    static void leerMatriz(int M[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Ingrese el valor: " + i + "," + j);
                M[i][j] = input.nextInt();
            }
        }
    }

    static void impMatriz(int M[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(M[i][j] + "|");
            }
            System.out.println();
        }
    }

    /**
     * Calcular el mayor elemento de una matriz:
     */
    static int mayorMatriz(int M[][], int n, int m) {
        int z = 1, mayor = M[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = z; j < m; j++) {
                if (M[i][j] > mayor) {
                    mayor = M[i][j];
                }
            }
            z = 0;
        }
        return mayor;
    }

    static void leerMatrizCadena(String M[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                do {
                    System.out.println("Ingrese el valor: " + i + "," + j);
                    M[i][j] = input.nextLine();
                } while (M[i][j].length() < 10);
            }
        }
    }

    static int contarPalabras(String cad) {
        int cont = 0, tam = cad.length(), i = 0, j = 0;
        while (i < tam) {
            while (i < tam && cad.charAt(i) == ' ') {
                i++;
            }
            j = i;
            while (j < tam && cad.charAt(j) != ' ') {
                j++;
            }
            if (cad.substring(i, j).length() > 0) {
                cont++;
            }
            i = j;
        }
        return cont;
    }

    static void generarMatrizEnteros(String Cad[][], int n, int m, int M[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                M[i][j] = contarPalabras(Cad[i][j]);
            }
        }
    }

    static boolean sequentialSearchVector(int v[], int dim, int x) {
        int i = 0;
        while (i < dim) {
            if (v[i] == x) {
                return true;
            } else {
                i++;
            }
        }
        return false;
    }

    static boolean isPrime(int n) {
        int contDiv = 0, div = 1;
        while (contDiv < 2 && div <= n) {
            if (n % div == 0) {
                contDiv++;
            }
            div++;
        }
        return contDiv == 2;
    }

    static int generarVectorPrimos(int M[][], int n, int m, int v[], int k) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isPrime(M[i][j])) {
                    if (!sequentialSearchVector(v, k, M[i][j])) {
                        v[k] = M[i][j];
                        k++;
                    }
                }
            }
        }
        return k;
    }

    static void impVec(int v[], int dim) {
        for (int i = 0; i < dim; i++) {
            System.out.print(v[i] + "|");
        }
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[][] = new int[100][100];
        int vec[] = new int[100 * 100];
        String Cadenas[][] = new String[100][100];
        int n = 1, m = 2, k = 0;
        leerMatrizCadena(Cadenas, n, m);
        System.out.println("La matriz con el contador de palabras es: ");
        generarMatrizEnteros(Cadenas, n, m, A);
        impMatriz(A, n, m);
        System.out.println("El vector generado es: ");
        k = generarVectorPrimos(A, n, m, vec, k);
        impVec(vec, k);
    }

}
