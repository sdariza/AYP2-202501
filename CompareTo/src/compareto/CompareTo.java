/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compareto;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class CompareTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cad1 = "", cad2 = "";
        int pos = 0, tam1 = 0, tam2 = 0, minLong = 0, diff=0;
        boolean sw = true;
        while (tam1 <= 0) {
            System.out.println("Ingresa una cadena válida");
            cad1 = input.next();
            tam1 = cad1.length();
        }
        while (tam2 <= 0) {
            System.out.println("Ingresa una cadena válida");
            cad2 = input.next();
            tam2 = cad2.length();
        }
        if (tam1 > tam2) {
            minLong = tam2;
        } else {
            minLong = tam1;
        }
        while (sw && pos < minLong) {
            if (cad1.charAt(pos) != cad2.charAt(pos)) {
                sw = false;
                diff = cad1.charAt(pos)- cad2.charAt(pos);
            }else
                pos++;
        }
        if (sw) {
            diff = tam1 - tam2;
        }
        if (diff == 0) {
            System.out.println("Las cadenas son iguales");
        }
        if (diff >0) {
            System.out.println("La cadena 1 es mayor que la cadena 2");
        }
        if (diff < 0) {
            System.out.println("La cadenas 2 es mayor que la cadena 1");
        }
    }

}
