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
public class EX_11 {

    public static void main(String[] args) {


        String dato;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int x=(int) (100*Math.random()+1);
        int numero=0;
        int INTENTOS = 10;
        do{
                try {
                    System.out.println("Introduce un numero para adivinar el numero X (quedan " + INTENTOS + " intentos)");
                    dato = buffer.readLine();
                    numero=Integer.parseInt(dato);
                    if(numero>x){
                        System.out.println("Su numero es mayor");
                        INTENTOS--;
                    }
                    if(numero<x){
                        System.out.println("Su numero es menor");
                        INTENTOS--;
                    }
                    if(numero==x){
                        System.out.println("Ole ha ganadao");
                        break;
                    }
                } catch (Exception e) {
                    System.err.println("Error menumental. Nu cuenta");
                    continue;
                }
                if (INTENTOS==0){
                    System.out.println("HAS PERDIDO");
                    break;
                }
        }while(true);
    }
}


