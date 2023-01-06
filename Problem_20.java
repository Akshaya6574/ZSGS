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
public class Problem_20 {
    public static void main(String[] args) {
        System.out.println("enter value for x");
        Scanner sc=new Scanner(System.in);
     //evaluate the expression
    
    int x=sc.nextInt();
    x=x++ *2 +3 * -x;
    /*it works under higer order of precedance
    postfix operator ranks first
    unary operator ranks second
    multipication ranks third
    addition ranks fourth
    */
      System.out.println(x);
    }
    
    
    
    
}
