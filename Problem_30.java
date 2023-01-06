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
public class Problem_30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        System.out.println("enter num3");
        int num3=sc.nextInt();
        if(num1>num2&&num1>num3)
        {
            System.out.println(num1 +" num1 is largest");
        }
        else if(num2>num1&&num1>num2)
        {
            System.out.println(num2 +" num2 is largest");
        }
        else
        {
            System.out.println(num3 +" num3 is largest");
        }
    }
    
}
