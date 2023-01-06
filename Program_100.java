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
public class Program_100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the ascii value ");
        int ascii=sc.nextInt();
        char character=(char)ascii;
        System.out.println("character is "+character);
        //version 2
       //toString()
       String str=new Character((char)ascii).toString();
        System.out.println("version2 "+str);
        
    }
    
}
