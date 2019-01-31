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
public class EX_10 {

    public static void main(String[] args) {

        String dato;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int x = (int) (100 * Math.random() + 1);
        int numero = 0;
        do {
            try {
                System.out.println("Introduce un numero:");
                dato = buffer.readLine();
                numero = Integer.parseInt(dato);
            } catch (Exception e) {
                System.err.println("ERROR VUELVE A EMPEZAR DE 0");
                continue;
            }
            if (numero > x) {
                System.out.println("Su numero es mayor que X");
            }
            if (numero < x) {
                System.out.println("Su numero es menor que X");
            }
            if (numero == x) {
                System.out.println("OLE ha ganado");
                break;
            }
        } while (true);
        System.out.println("FIN DE PARTIDA");
    }
}
