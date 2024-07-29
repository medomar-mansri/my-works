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
public class température {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int choice ; 
        do {
        System.out.print("\nplease select a choice\n");
        System.out.print("1-Fahrenheit ==>Celsius\n");
        System.out.print("2-Celsius==>Fahrenheit\n");
        System.out.print("3-exit\n");
        System.out.print("choice:");
        choice=input.nextInt();
        switch(choice){
            case 1 : 
                System.out.print("please enter the temperature on Fahrenheit :");
                int temperature_Fahrenheit=input.nextInt();
                int new_temperature=(temperature_Fahrenheit-32)*5/9;
                System.out.print("temperature on Celsius = "+new_temperature+"C\n");
                break;
            case 2 : 
                System.out.print("please enter the temperature on Celsius :");
                int temperature_Celsius=input.nextInt();
                int new_temperature1=(temperature_Celsius*9/5)+32;
                System.out.print("temperature on Fahrenheit = "+new_temperature1+"F\n");
                break;
            case 3 :
         System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        } while (choice != 3);

    }}
    