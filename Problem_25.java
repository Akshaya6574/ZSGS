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
public class Problem_25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n1");
        int n1=sc.nextInt();
        System.out.println("enter n2");
        int n2=sc.nextInt();
        int quotient=n1/n2;
        System.out.println("quotient is"+ quotient);
        int remainder=n1%n2;
        System.out.println("remainder is"+ remainder);
    }
    
}
