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
public class Program_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int num1 =sc.nextInt();
        System.out.println("enter num2");
        int num2 =sc.nextInt();
        //functionalities of bitwise operators
        
        System.out.println("num1|num2  = "+(num1|num2));//bitwise OR (0101)|(0111)=0111
        System.out.println("num1&num2  = "+(num1&num2));//bitwise AND (0101)&(0111)=0101
        System.out.println("~num1 = "+(~num1));//bitwise complement ~(0101)=1010
        System.out.println("num1^num2  = "+(num1^num2));//bitwise XOR (0101)^(0111)=0010

    }
    
}
