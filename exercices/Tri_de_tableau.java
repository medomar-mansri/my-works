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

public class Tri_de_tableau {
    public static void main(String[] args) {
        boolean test = true;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the size : ");
        int size = input.nextInt();
        int[] table = new int[size];

        System.out.println("please fill the table  ");
        for (int i = 0; i < size; i++) {
            table[i] = input.nextInt();
        }
        System.out.println("before\n");
        for (int i = 0; i < size; i++)
               System.out.println("table[ "+(i+1)+"]="+table[i]);
        do {
            test = true;
        for (int i = 0 ;i<size-1 ;i++){
            if (table[i]>table[i+1]){
                int temp=table[i];
                table[i]=table[i+1];
                table[i+1]=temp;
                test=false;
            }
        }}while(!test);
        System.out.println("after;\n");
          for (int i = 0; i < size; i++)
               System.out.println("table[ "+(i+1)+"]="+table[i]);
            
     }}