/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problems;

/**
 *
 * @author medom
 */

import java.util.Scanner;
import java.util.Random;
public class random_game {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean test= true;
        int guesses;
        int number=random.nextInt(100);
         System.out.println("try to guess the number between 1 and 100");
         do {
            System.out.print("take a guess :");
            guesses = input.nextInt();
             if (guesses < 1 || guesses > 100){
                System.out.println("your number is out of range");
                 }
            else if (guesses==number){
                System.out.println("good job you win !! the number is "+number);
                test = false ; }
            else if(guesses < number) {
                System.out.println("your guess is a little bit  low ");
                
            }
            else{
                System.out.println("your guess is a little bit  high ");
               }
           
         
        
    }while (test);
    
}}
