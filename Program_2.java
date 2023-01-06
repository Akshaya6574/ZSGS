/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

import java.util.Scanner;
public class Program_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sc.next().charAt(0);
        //uppercase
        if(ch>=65&&ch<=90)
        {
          for(char i=ch;i<=90;i++) 
          {
              
              System.out.println(i+" ");
          }
        }
        //lowercase
        else if(ch>=97&&ch<=122)
        {
            for(char i=ch;i<=122;i++)
            {
              System.out.print(i+" ");  
            }
             
        }
        else
        {
            System.out.println("invalid character");
        }
        
        
    }
    
}
