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
public class Program_95 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        
        String s1=sc.next();
        //String s1="madam";
        String s2=sc.next();
        int ispalindrome=1;
        int l=0;
        //int n=s1.length();
        int r =s1.length()-1;
        while(l<r)
        {
            if(s1.charAt(l)!=s1.charAt(r))
            {
                ispalindrome=0;
                break;
            }
            l++;
            r--;
        }
        
        if(ispalindrome==0)
        {
            System.out.println("its not a palindrome");
        }
        else
        {
            
            System.out.println("it is palindrome");
            
        }
        //version 2
        /*
        StringBuffer buffer = new StringBuffer(s1);
        String s2=sc.next();
        buffer.reverse();
        String finalstr=buffer.toString();
        if(finalstr.equals(s2))
        System.out.println("its  a palindrome");
        else
        System.out.println("its not a palindrome");
        */
}
}
