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
public class EX_16 {

    public static void main(String[] args) {

        String dato;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int n = 0;
        int numero = 0;
        int sueldoMax = 0;
        try {
            System.out.println("Introduce un numero N");
            dato = buffer.readLine();
            n = Integer.parseInt(dato);
            for (i = 1; i <= n; i++) {
                System.out.println("Introduce un sueldo");
                dato = buffer.readLine();
                numero = Integer.parseInt(dato);
                if (numero > sueldoMax) {
                    sueldoMax = numero;
                }
            }
        } catch (Exception e) {
            System.err.println("ERROR esto no es un numero");

        }
        System.out.println("El sueldo maximo introducido es: " + sueldoMax);
    }
}
