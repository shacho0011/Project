/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankmanagementsystem;
import java.util.Scanner;
/**
 *
 * @author Shadhin
 */
//input number otherwise it will generate exception
public class ExceptionClass extends Exception{
    
    void numberexceptionclass(String s){
        try{
            int i = Integer.parseInt(s);
            }catch(NumberFormatException ex){
                System.out.println("String entered!");
        }
    }
    
    boolean stringexceptionclass(String s){
        int i, tf = 1;
        for(i=0; i<s.length(); i++)
            if(Character.isDigit(s.charAt(i))){
                tf = 0;break;
            }
        if(tf == 1) return true;
        else return false;
    }
    
    void check(String s){
        boolean bol = stringexceptionclass(s);
        if(bol) System.out.println(""+s);
        else System.out.println("Number Entered!");
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        ExceptionClass ec = new ExceptionClass();
        ec.numberexceptionclass(s);
        ec.check(s);
    }
}
