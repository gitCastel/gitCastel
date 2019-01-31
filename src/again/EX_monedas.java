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


// EL ejercicio de las monedas con un bucle for y un array



public class EX_monedas {

    public static void main(String[] args) {

        String dato;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int cambio = 297; 

        int num = 0;
        int[] valor = {100, 50, 20, 10, 5, 2, 1};

        for (int i = 0; i < valor.length; i++) {

            num = cambio / valor[i];
            cambio -= num * valor[i];
            if (valor[i] < 100) {
                System.out.println(num + " x " + valor[i] + "cent.");
            } else {
                System.out.println(num + " x " + valor[i] / 100 + "Euro.");
            }

        }
    }

}
