/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */
import java.util.Scanner;
public class Program_99 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String result="";
                for(int i=0;i<str.length();i++)
                {
                   if(str.charAt(i)>=97&&str.charAt(i)<=122) 
                       result+=(char)(str.charAt(i)-32);
                }
                System.out.println(result);
                //version 2
                /*
                String str1=sc.next;  
        StringBuffer newStr=new StringBuffer(str1);  
          
        for(int i = 0; i < str1.length(); i++) 
                {  
              
            //Checks for lower case character  
            if(Character.isLowerCase(str1.charAt(i))) 
                {  
                 
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));  
            }  
             
            }  
        }  
        System.out.println("String after case conversion : " + newStr);  
                */
    }
    
}
