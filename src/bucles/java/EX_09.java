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
public class EX_09 {

    public static void main(String[] args) {

        String dato;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        int i = 0;
        int max = -9999;
        int min = 99999;
        int cantNumeros = 0;
        double media = 0.0;
        int sumaNumeros = 0;
        do {
            try {
                System.out.println("Introduce un numero: ");
                dato = buffer.readLine();
                numero = Integer.parseInt(dato);
                if(numero==999){
                    break;
                }
                

                if (numero > max) {
                    max = numero;

                }
                if (numero < min) {
                    min = numero;

                }

            } catch (Exception e) {
                System.err.println("Error monumental");
            }
            cantNumeros++;
            sumaNumeros += numero;

        }while (numero != 999);
       
    
        
           
        

        media = (double) sumaNumeros / cantNumeros;

        System.out.println("el numero maximo es: " + max);
        System.out.println("el numero minimo es: " + min);
        System.out.println("La media de los numeros introducidos es: " + media);

    }

}
