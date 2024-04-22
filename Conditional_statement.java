/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditional_statement;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Conditional_statement {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        operation op = new operation();
        condition con = new condition();
       
       System.out.print("choose between 1,2,3,4,5\n"
                      + "1:add\n"
                      + "2:sub\n"
                      + "3:mult\n"
                      + "4:div\n"
                      + "5:check if it is odd or even\n");
       int num;
       num=sc.nextInt();
       switch(num){
            case 1:       
        System.out.print("Please enter number a\n");
        op.a=sc.nextInt();
        System.out.print("Please enter number b\n");
        op.b=sc.nextInt();
                op.add();
                break;
            case 2:
                
        System.out.print("Please enter number a\n");
       op.a=sc.nextInt();
       System.out.print("Please enter number b\n");
       op.b=sc.nextInt();
                op.sub();
                break;
            case 3:
                
        System.out.print("Please enter number a\n");
       op.a=sc.nextInt();
       System.out.print("Please enter number b\n");
       op.b=sc.nextInt();
                op.mult();
                break;
            case 4:
               
        System.out.print("Please enter number a\n");
       op.a=sc.nextInt();
       System.out.print("Please enter number b\n");
       op.b=sc.nextInt();
                op.div();
                break;  
            case 5:
                System.out.print("Enter the number to check\n");
                con.num=sc.nextInt();
                con.check();
                break;
            default:  
             System.out.print("INVALID INPUT");   
        }  
        
        // TODO code application logic here
    }
    
}
