/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercices;

/**
 *
 * @author medom
 */
import java.util.Scanner;
public class Facteur {
    public static void main(String[] args ){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the number: ");
        int number=input.nextInt();
        for (int i=1;i<number;i++){
            if (number%i==0){
                System.out.println(i+" is a factor of "+number);
            }
        }
        
        
    }
}