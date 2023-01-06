/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

import java.util.Scanner;

/**
 *
 * @author AKSHAYA
 */
public class Program_96 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        
        String str=sc.next();
        System.out.println("enter the element to be searched in the given string");
        char search=sc.next().charAt(0);
       boolean flag=true;
        for(int i=0;i<str.length();i++)
        {
         if(str.charAt(i)==search)  
         {
             System.out.println("character found "+i);
             flag=false;
             break;
             
         }
         
        }
        if(flag)
            System.out.println("character not found");
        
        
    }
    
}
