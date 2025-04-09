/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringmatrix;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class StringMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[][] = new int[100][100]; // --> matriz solo guarda enteros
        String Cadenas[][] = new String[100][100];
        int n = 0, m = 0;// n-->filas m --> columnas
        while (n <= 0) {
            System.out.println("Debes ingresar el número de filas");
            n = input.nextInt();
        }
        while (m <= 0) {
            System.out.println("Debes ingresar el número de columnas");
            m = input.nextInt();
        }
        for (int i = 0; i < n; i++) {// iterar con i las filas
            for (int j = 0; j < m; j++) {// iterar con j las columnas
                System.out.println("Ingresa la cadena en la pos: CAD[" + i + "," + j + "]: ");
                Cadenas[i][j] = input.next();
            }
        }
        System.out.println("Elementos almacenados:");
        for (int i = 0; i < n; i++) {// iterar con i las filas
            for (int j = 0; j < m; j++) {// iterar con j las columnas
                System.out.print(Cadenas[i][j]+"|");
            }
            System.out.println("");
        }
        
    }

}
