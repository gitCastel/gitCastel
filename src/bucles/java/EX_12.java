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
public class EX_12 {

    public static void main(String[] args) {
        String dato;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;
        int moneda50 = 0;
        int moneda20 = 0;
        int moneda10 = 0;
        int moneda5 = 0;
        int moneda2 = 0;
        int moneda1 = 0;

        try {
            System.out.println("Introduce una cantidad de centimos");
            dato = buffer.readLine();
            numero = Integer.parseInt(dato);
        } catch (Exception e) {
            System.err.println("Error");
            return;
        }
        while (numero >= 50) {
            numero = numero - 50;
            moneda50++;
        }
        while (numero < 50 && numero >= 20) {
            numero = numero - 20;
            moneda20++;
        }
        while (numero < 20 && numero >= 10) {
            numero = numero - 10;
            moneda10++;
        }
        while (numero < 10 && numero >= 5) {
            numero = numero - 5;
            moneda5++;
        }
        while (numero < 5 && numero >= 2) {
            numero = numero - 2;
            moneda2++;
        }
        while (numero < 2 && numero >= 1) {
            numero = numero - 1;
            moneda1++;
        }

        System.out.println(+moneda50 + " Monedas de 50 centimos");
        System.out.println(+moneda20 + " Monedas de 20 centimos");
        System.out.println(+moneda10 + " Monedas de 10 centimos");
        System.out.println(+moneda5 + " Monedas de 5 centimos");
        System.out.println(+moneda2 + " Monedas de 2 centimos");
        System.out.println(+moneda1 + " Monedas de 1 centimos");
    }
}
