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
public class Palindrome {
     public static void main(String[] args) {
          boolean test = true;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter string of characters : ");
        String string1 = input.nextLine();
        int front=0;
        int back=string1.length()-1;
        do {
            if (string1.charAt(front)!=string1.charAt(back)){
                test= false;
             break;}
            else
                back--;
            front++;
            
        }while(front<back);
        if (test)
            System.out.println(string1 +" is palindrome");
        else
            System.out.println(string1 +" is not palindrome ");
    
}}