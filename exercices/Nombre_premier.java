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
public class Nombre_premier {
    public static void main (String [] args){
        boolean test = true;
    Scanner input=new Scanner(System.in);
        System.out.println("please enter the number: ");
        int number=input.nextInt();
        if (number<=1)
                test=false;
                        else{
        for (int i=2; i <=number/2;i++){
            if (number%i==0){
                test= false;
                break;
            }
        }}
        if (test){
            System.out.println(number +" is prime ");
        }
        else
            System.out.println(number +" is not  prime ");
    }
}