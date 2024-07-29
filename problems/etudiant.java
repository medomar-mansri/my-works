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
import java.util.ArrayList;
import java.util.Arrays;
public class etudiant {
    private String name ;
    private String firstname ;
    private String ID ;
    private int  size ;
    private int [] notes;
    public etudiant(String name ,String firstname,String ID ,int size){
    this.name=name;
    this.firstname=firstname;
    this.ID= ID;
    this.size=size;
    this.notes=new int[size];
    }
    
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getfirstname() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
public int[] getnotes() {
        return notes;
    }
  public void setnotes(int[] notes) {
        this.notes = notes;
    }
   public int getsize(){
      return size;
  }
      public double moy() {
        double somme = 0;
        for (int note : notes) {
            somme += note;
        }
        if (size>0)
            return somme/size;
        else 
            return 0;
    }
   
    public String toString() {
    return "Name: " + name + ", Firstname: " + firstname + ", ID: " + ID + ", Notes: " + Arrays.toString(notes);
}
}

class gestion{
     static ArrayList<etudiant>etudiants= new ArrayList<>();
     static Scanner input = new Scanner(System.in);
     
     static void add_etudiant(){
        System.out.print("Enter the  name: ");
        String name = input.nextLine();
        System.out.print("Enter the first name: ");
        String firstname = input.nextLine();
        System.out.print("Enter the ID: ");
        String ID = input.nextLine();
        System.out.print("Enter number of subjects ");
        int size = input.nextInt();
        input.nextLine(); 
        etudiant student=new etudiant(name,firstname,ID,size);
        int[] notes = new int[size];
        for (int i=0 ;i<size;i++){
             System.out.print("Enter the garde of the subject num  "+(i+1)+":");
             notes[i]=input.nextInt();
        }
        input.nextLine();
        student.setnotes(notes);  
        etudiants.add(student);
        System.out.println("New student has been added successfully.");
    }
     
     static void display() {
        for (etudiant student : etudiants) {
            System.out.println(student);
        }}
     
     static void calcul_moy(){
          if (etudiants.isEmpty()) {
            System.out.println("there is no student");
        }
          else{
        for (etudiant student : etudiants) {
            System.out.println("name " + student.getname() + ",moy= " + student.moy());
        }
    }
     }
     
     
     public static void main(String[] args) {
            int choice;
            do{
            System.out.println("1. add a student");
            System.out.println("2. display the students list");
            System.out.println("3. moyenne");
            System.out.println("4. Quitter");
            choice = input.nextInt();
            input.nextLine(); 
            switch (choice) {
                case 1:
                    add_etudiant();    
                    break;

                case 2:
                    display();
                    break;
                    
                case 3: 
                    calcul_moy();
                    break;
                case 4:
                    System.out.println("goodbye");
                    return;

                default:
                    System.out.println("wrong choice.");
            }
        }while (choice != 4);
}
}
       
             
         
     
