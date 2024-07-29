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
public class Calculatrice {
    public static void main(String[] args){
        int result=0;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the first number : ");
        int first_number=input.nextInt();
        System.out.print("please enter the second number : ");
        int second_number=input.nextInt();
        int operation_number;
        do {
        System.out.print("please select the numbre of the Operation :\n ");
        System.out.print("1-addition \n 2-subtraction \n 3-multiplication \n 4-division\n 5-exit\n ");
        System.out.print(" Operation number: ");
        operation_number = input.nextInt();
        switch(operation_number){
            case 1: result=first_number+second_number;
            System.out.println("Result: " + result);
            break;
            case 2: result=first_number-second_number;
            System.out.println("Result: " + result);
            break;
            case 3: result=first_number*second_number;
            System.out.println("Result: " + result);
            break;
            case 4:if (second_number != 0) {
                        result = first_number / second_number;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
            break;
            case 5:System.out.println("Exiting the calculator. Goodbye!");
            break;
            default:System.out.print("incorrect opparation number , please try again \n");
        }
        }while (operation_number!=5);
        System.out.print("result="+result+"\n");}
        
    }