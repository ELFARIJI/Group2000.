/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;
import java.util.Scanner;

public class Inheritance {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      DIT di=new DIT();
      computerstudies co=new computerstudies();
      
    co.DisplayInfo();
    co.Leadership();
    
    int choice = 1;
    System.out.println("Enter your choice\n"
        +"1: About us\n"
        +"2: location\n"
        +"3: Colour\n"
        +"4: Leadership\n");
    
    while(choice <5){
        System.out.println("\nEnter your choice");
        choice=sc.nextInt();
        
      switch(choice)  {
          case 1:
              co.DisplayInfo();
              break;
          case 2:
              co.Location();
              break;
          case 3:
              co.Colour();
              break;
           case 4:
              co.Leadership();
              break;   
              
           default:
           System.out.println("INVALID CHOICE\n");    

              
          
              
      }
    }
    }
    
}
