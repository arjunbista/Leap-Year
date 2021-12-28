/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class testing {
    public static void main(String[] args) {
        String s = "Thank You ";
        s.toUpperCase();
        s += "WelCOME. ";    
        System.out.println(s);
        
        s = s.toLowerCase();
        s += "Please";
        System.out.println(s);
        
        String x = "Hello SIR";
        x.toUpperCase();
        String y = x.replace('S', 's');
        y = y + " How may I help You.";
        System.out.println(y);
        System.out.println("output of X: "+x);
        
    }
}
