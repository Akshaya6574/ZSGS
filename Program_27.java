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
public class Program_27 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        System.out.println("before swapping");
        System.out.println(" num1 is "+num1 +" num2 is "+ num2);
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("after swapping");
        System.out.println(" num1 is "+ num1+" num2 is "+ num2);
         
        
        
      
    }
    
    
    
}
