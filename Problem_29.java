/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

import java.util.Scanner;
public class Problem_29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sc.next().toLowerCase().charAt(0);
        if(ch>='a'&&ch<='z')
        {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("vowel");
        }
        else
        {
            System.out.println("consonant");
        }
        }
        else
        System.out.println("invalid charcter");
        
        
        
    }
    
}
