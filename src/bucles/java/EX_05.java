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
public class EX_05 {

    public static void main(String[] args) {

        String dato;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;
        int i = 0;

        try {
            System.out.println("Introduce un numero: ");
            dato = buffer.readLine();
            numero = Integer.parseInt(dato);

            for (i = numero - 1; i > 1; i--) {
                if (numero % i == 0) {
                    System.out.println("No es primo");
                    return;
                }  
                   
                }
            System.out.println("Es primo");
           
            
        } catch (Exception e) {
            System.err.println("Error");
        }

    }

}
