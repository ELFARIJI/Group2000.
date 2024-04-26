/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

public class DIT {
    String name= "Dar es salaam Institute of Technology";
    String ID= "DIT/220343";
    String leader= "DITSO";
    String leaderID= "DITSO1234";
    
    void DisplayInfo(){
      System.out.println("DIT-ABOUT US");
      System.out.println("Name: "+name);
      System.out.println("ID: "+ID); 
      
    }
    
    void Location(){
      System.out.println("Location:");  
      System.out.println("We are located at Bibi Titi and Morogoro street.\n");
    }
    
    void Colour(){
      System.out.println("black.");
      System.out.println("white.\n");
    }
    
    String Leadership(){
      System.out.println("leader: "+leader);
      System.out.println("leaderID: "+leaderID);
      return leader + leaderID;
        
    }
    }


