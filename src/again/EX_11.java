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
public class EX_11 {

    public static void main(String[] args) {

        String dato;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int x = (int) (100 * Math.random() + 1);
        int numero = 0;
        int INTENTOS = 10;
        do {
            try {

                System.out.println("Introduce un numero para acertar el numero X (TE QUEDAN " + INTENTOS + " INTENTOS)");
                dato = buffer.readLine();
                numero = Integer.parseInt(dato);
                if (numero > x) {
                    System.out.println("Su numero es mayor que X");
                    INTENTOS--;
                }
                if(numero<x){
                    System.out.println("Su numero es menor que X");
                    INTENTOS--;
                }
                if(numero==x){
                    System.out.println("Ole ha ganado");
                    break;
                }
            } catch (Exception e) {
                System.err.println("ERROR ESTO NO CUENTA PUEDE CONTINUAR");
                continue;
            }
            if(INTENTOS==0){
                System.err.println("HA PERDIDO");
                break;
            }
        } while (true);

    }
}
