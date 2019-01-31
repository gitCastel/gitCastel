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
public class EX_08 {

    public static void main(String[] args) {

        String dato;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        
        int numero=0;
        
        try {
            System.out.println("Introduce un numero: ");
            dato = buffer.readLine();
            numero = Integer.parseInt(dato);
            
            for(int i = numero-1;i > 0; i--){
                if(i %2 !=0){
                    System.out.println(i);
                }
            }
            
        } catch (Exception e) {
            System.err.println("Error monumental");
        }


    }
}
