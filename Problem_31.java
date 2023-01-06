/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;


import java.util.Scanner;
public class Problem_31 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("enter the value of coefficients a,b,c of the quadratic equation ax2+bx+c=0");
        System.out.println("enter the value of a");
        double a = sc.nextInt();
         System.out.println("enter the value of b");
        double b = sc.nextInt();
         System.out.println("enter the value of c");
        double c = sc.nextInt();
        double d=(b*b)-(4*a*c);
        
        if(d>=0)
        {
           System.out.println("roots are real");
            double r1=(-b+Math.sqrt(d))/(2*a);
            double r2=(-b-Math.sqrt(d))/(2*a);
            System.out.format("r1 is %.2f and r2 is %.2f ",r1,r2);
        }
        else
        {
            System.out.println("roots are imaginary");
            double real=(-b)/(2*a);
            double img=(Math.sqrt(-d))/(2*a);
            System.out.format("r1 is %.2f+%.2fi and r2 is %.2f-%.2fi",real,img,real,img);
            
            
        }
              
        
        
    }
    
}
