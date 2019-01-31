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
public class EX_08 {

    public static void main(String[] args) {

        String dato;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;
        int i = 0;
        try {
            System.out.println("introduce un numero");
            dato = buffer.readLine();
            numero = Integer.parseInt(dato);

        } catch (Exception e) {
            System.err.println("error");
        }
        for (i = numero - 1; i > 0; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }
}
