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
public class Program_35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of a number is "+fact);
        int sum=0,rem;
        while(fact>0)
        {
            rem=fact%10;
            sum=sum+rem;
            fact=fact/10;
        }
        
        System.out.println("sum of digits of factorial number "+sum);
    }
    
}
