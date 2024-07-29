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
 public class Gestion_des_contacts {
    private int num ;
    private String address;
    private String name;
    public Gestion_des_contacts(int num,String address,String name ){
        this.num= num;
        this.address = address;
        this.name=name;
    }
    
    public String getname(){
        return name ;
    }
    public int getnum(){
        return num ;
    }
    public String getaddress(){
        return address ;
    }
    public void setname(String name){
        this.name=name;        
    }
    public void setnum(int num){
        this.num=num;   
    }
    public void setaddress(String address ){
        this.address=address;
        
    }
    public String toString() {
        return "Name: " + name + ", Phone: " + num + ", Address: " + address;
    }
}
 class contact{
     
    static ArrayList<Gestion_des_contacts>contacts = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static void add_contact(){
        System.out.print("Enter phone: ");
        int num = input.nextInt();
        input.nextLine(); 
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter address: ");
        String address = input.nextLine();
        contacts.add(new Gestion_des_contacts(num,address,name));
        System.out.println("new contact has been added successfully.");  
    }
    static void remove_contact(){
        System.out.print("Enter the  phone of the contact u want to delete ");
        int phone = input.nextInt();
        input.nextLine();
        boolean test = true;
        for (Gestion_des_contacts c : contacts){
            if (c.getnum()==phone){
                contacts.remove(c);
                System.out.println("Contact deleted successfully.");
                test=true;
                break;
            }
            else
                test= false;   
        }
        if(!test)
             System.out.print("contact not found");   
    }
   static void edit_contact(){
        System.out.print("Enter the  phone of the contact u want to delete ");
        int phone = input.nextInt();
        input.nextLine();
        boolean test = true;
        for (Gestion_des_contacts c : contacts){
            if (c.getnum()==phone){
                 test=true;
                 System.out.print("select what u want to modify:\n");
                 System.out.print("1-name\n");
                 System.out.print("2-phone\n");
                 System.out.print("3-address\n");
                 int option = input.nextInt();
                 input.nextLine();
                 switch(option){
                     case 1 : System.out.print("Enter new name: ");
                              String name = input.nextLine();
                              c.setname(name);
                              break;
                     case 2 : System.out.print("Enter new phone: ");
                              int phone1 = input.nextInt();
                              input.nextLine();
                              c.setnum(phone1);
                              break;
                     case 3 : System.out.print("Enter new address: ");
                              String address = input.nextLine();
                              c.setaddress(address);
                              break;
                     default :System.out.print("wrong option number please try again ");
                     break;
                              
                  }}
            else
               test=false;
    }
    
        if (!test)
            System.out.print("contact not found");  }
   static void display(){
         if (contacts.isEmpty()) {
            System.out.println("No contacts to display.");
        } else {
            for (Gestion_des_contacts c : contacts) {
                System.out.println(c);
            }
        }
        
    }            
    public static void main(String [] args){
        int option= 0 ;  
         do {
            System.out.print("Choose an option: \n");
            System.out.println("1- Add Contact");
            System.out.println("2- Modify Contact");
            System.out.println("3- Delete Contact");
            System.out.println("4- Display Contacts");
            System.out.println("5- Exit");
             option = input.nextInt();

            switch (option) {
                case 1:
                    add_contact();
                    break;
                case 2:
                    edit_contact();
                    break;
                case 3:
                    remove_contact();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("Exiting.. goodbye !");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
         }while (option!=5);
        }
    }
