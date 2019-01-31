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

//int n=10000;
//while(n>=1)
//numero%(n*10)/n


public class practicando_clase {

    public static void main(String[] args) {
//ese programita con un bucle pide 10 numeros al usuario, si se equivoca de numero vuelte a pedir el numero, si esta bien te pide el siguente.
// hay una  variable aforoMax que cuando llega a 50 para de pedir mas numeros al usuario, EJEMPLO AFORO DE UN RESTAURANTE 
        int num=0;
        boolean numOk = true;
        int acumulado = 0;
        int aforoMax=50;
        int DIAS_SEMANA=7;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String dato;
        for(int i=0;i<10;i++){
        do {
            numOk = true;
            try {
                System.out.println("Numero " +i);
                dato = buffer.readLine();
                num = Integer.parseInt(dato);
               
            } catch (Exception e) {
                System.err.println("Eso no es un numero");
                numOk = false;
            }

        } while (!numOk);
        acumulado+=num;
        if(acumulado>=aforoMax) break;
        
        
        
        }
        System.out.println("Hay " + acumulado+ " personas en la sala");

    }
}
