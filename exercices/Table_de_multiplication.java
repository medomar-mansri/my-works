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
public class Table_de_multiplication {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the number: ");
        int number=input.nextInt();
        for (int i=0 ;i<=9;i++){
            System.out.println(number+"X"+i+"="+i*number);
        }
    }
    
}