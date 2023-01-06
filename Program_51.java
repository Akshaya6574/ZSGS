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
public class Program_51 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();
       
        int rev=0;
        int rem;
        while(number>0)
        {
            rem=number%10;
            rev=(rev*10)+rem;
            number=number/10;
        }
        System.out.println("the number in reverse order is "+rev);
    }
}
