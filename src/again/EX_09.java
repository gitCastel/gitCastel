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
public class EX_09 {

    public static void main(String[] args) {

        String dato;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;
        int i = 0;
        int numMax = -99999;
        int numMin = 99999;
        int sumNum = 0;
        int cantNum = 0;
        double media = 0.0;
        do {
            try {
                System.out.println("Introduce un numero");
                dato = buffer.readLine();
                numero = Integer.parseInt(dato);
                if((numero == 999) || (numero==0)){
                break;
            }

            } catch (Exception e) {
                System.err.println("error");
            }
            if (numero > numMax) {
                numMax = numero;
            }
            if (numero < numMin) {
                numMin = numero;
            }
            sumNum += numero;
            cantNum++;

        } while (numero != 999);
        
        media =(double) sumNum / cantNum;
        
        System.out.println("El numero maximo es: " + numMax);
        System.out.println("El numero minimo es: " + numMin);
        System.out.println("La media de todos los numeros es: " + media);
    }
}
