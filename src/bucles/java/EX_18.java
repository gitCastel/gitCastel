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
public class EX_18 {

    public static void main(String[] args) {

        String dato;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;
        int n = 1;
        try {
            System.out.println("Introduce un numero");
            dato = buffer.readLine();
            numero = Integer.parseInt(dato);

        } catch (Exception e) {
            System.err.println("Error");
        }
        String msg = "";

        //numero%10/1
        //numero%100/10
        //numero%1000/100
        //numero%10000/1000
        //numero%100000/10000
        
        if ((numero > 9999) && (numero < 99999)) {
            while (n <= 10000) {
                msg = (numero % (n * 10) / n)+msg;
                System.out.println(msg);
                n *= 10;
            }
        } else {
            System.err.println("Tiene que ser de 5 numeros");
        }

    }
}
