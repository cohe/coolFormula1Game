/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1game;

import java.util.Random;

/**
 *
 * @author coni
 */
public class Common {
    
    public static void print(String s){
        System.out.println("\n" + s);
    }
    
    public static void print1(String s){
        System.out.println(s);
    }
    public static int getRandomNumber(int max){
           Random ran = new Random();
            int number = ran.nextInt(max);
            return number;
    }

    
}
