/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author kalya
 */
public class EX_13 {

    public static void main(String[] args) {

        String dato;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        do {
            try {
                System.out.println("Introduce un numero para saber si es posotivo o negativo");
                dato = buffer.readLine();
                numero = Integer.parseInt(dato);
            } catch (Exception e) {
                System.err.println("Error esto no es un numero");
                return;
            }
            if (numero > 0) {
                System.out.println("POSITIVO");
            }
            if (numero < 0) {
                System.err.println("NEGATIVO");
            }
            if (numero == 0) {
                break;
            }
        } while (true);

    }
}
