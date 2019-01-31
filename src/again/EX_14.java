/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package again;

import bucles.java.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author kalya
 */
public class EX_14 {

    public static void main(String[] args) {

        String dato;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        int cantNum = 0;
        int sumaNum = 0;
        double mediaNum = 0.0;
        do {
            try {
                System.out.println("Introduce un numero");
                dato = buffer.readLine();
                numero = Integer.parseInt(dato);

                if (numero < 0) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Error");
                break;
            }
            if (numero > 0) {
                cantNum++;
                sumaNum += numero;
            }
        } while (true);
        mediaNum = (double) sumaNum / cantNum;
        System.out.println("La media de los numeros es: " + mediaNum);

    }
}
