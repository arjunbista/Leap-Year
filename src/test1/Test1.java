/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test1;
import java.util.*;

/**
 *
 * @author user
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to check Leap: ");
        int num = sc.nextInt();
        
        if(num%100==0){
            if(num%400==0){
                System.out.println("Leap Year.");
            }
            else{
                System.out.println("Not Leap Year..");
            }
        }
        else if(num%4==0){
            System.out.println("Leap Year ok.");
                   
    }
        else{
            System.out.println("Its not Leap Year ok..");
        }
           
             
              
        
    }
    
}
