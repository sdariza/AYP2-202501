/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadenas;

import java.util.Scanner;

/**
 *
 * @author sdariza
 */
public class Cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String x = "Hola";
        String y = "todos";
        //Concatención
        String xConty = x + y;
        System.out.println("x+y=" + xConty);
        //MAYUSCULA
        String xMay = x.toUpperCase();
        System.out.println("X may=" + xMay);
        //MINUSCULA
        String yMin = y.toLowerCase();
        System.out.println("y min=" + yMin);
        //STR --> depende de el tipo de dato de la varible
        int num = 51515484;
        String numCadena = Integer.toString(num);
        System.out.println(numCadena);
        double numFloat = 49845.05;
        String numFloatCadena = Double.toString(numFloat);
        System.out.println(numFloatCadena);
        //VAL("23424") --> Integer.parseInt("23424") = 23424
        int cadenaNum = Integer.parseInt(numCadena);
        System.out.println(cadenaNum);
        //SUBSTRING 
        /**
         * cad.substring(posi, posf) = cad.substring(posi, #carac + posi)
         * cad.substring(posi, #carac + posi) = SUBSTR(cad, posi, #carac)
         */
        String subString = xConty.substring(5, 2 + 5);
        System.out.println(subString);

        //ascii('a') --> castear a int el caracter
        System.out.println((int) 'a');

        //caracter(x, 0) --> x.charAt(0)
        System.out.println(x.charAt(0));

        //LONG --> length
        System.out.println("LONG(x)= " + x.length());

        /**
         * Realiza un algoritmo que cuente la cantidad de vocales en un texto
         */
        Scanner input = new Scanner(System.in);
        String text = "";
        int tam = 0, contVocales = 0;
        while (text.length() == 0) {
            System.out.println("Ingrese el texto");
            text = input.nextLine();
        }
        input.close();
        tam = text.length();
        text = text.toLowerCase();
        for (int i = 0; i < tam; i++) {
            char c = text.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú'
                    || c == 'ü') {
                contVocales++;
            }
        }
        System.out.println("El número de vocales es: " + contVocales);
    }

}
