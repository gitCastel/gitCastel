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
public class EX_15 {

    public static void main(String[] args) {

        String dato;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;
        int contador = 0;
        try {
            System.out.println("Introduce un numero");
            dato = buffer.readLine();
            numero = Integer.parseInt(dato);
            if (numero > 0 && numero < 99999) {
                while (numero > 0) {
                    numero = numero / 10;
                    contador++;
                }
            } else {
                System.err.println("El numero tiene que estar entre 0 y 99999");
                return;
            }

        } catch (Exception e) {
            System.err.println("Error esto no es un numero");
        }
        System.out.println("El numero tiene " + contador + " cifras");
    }
}
