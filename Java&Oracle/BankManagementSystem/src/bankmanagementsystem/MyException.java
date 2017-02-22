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
public class MyException extends Exception{
    String details;
    MyException(String s){
        details = s;
    }
    public String toString(){
        return "MyException["+ details +"]";
    }
}
class StringException{
    static void check(String s) throws MyException{
        System.out.println("Check("+ s +")");
        int in = Integer.parseInt(s);
        int i, k = 0;
        for(i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i)))
                k = 1;break;
        }
        if( k == 1) throw new MyException(s);
        System.out.println("NumberEntered");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try{
            check(s);
        }catch(MyException e){
            System.out.println("Number entered");
        }
        
    }
}
