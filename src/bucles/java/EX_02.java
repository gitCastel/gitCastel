/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles.java;

/**
 *
 * @author kalya
 */
public class EX_02 {
     public static void main(String[] args) {
         List<T> genericList = new ArrayList<>();
        for(int i=5;i<=500;i++){
            System.out.println(i);
        }

		genericList.foreach(System.out::println);
        int con = 10;
        while(con > 0){
            System.out.println("hola" + con);
            con--;
        }

     }
	
}
