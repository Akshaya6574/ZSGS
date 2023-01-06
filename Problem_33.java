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
public class Problem_33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sc.next().toLowerCase().charAt(0);
        if(ch>='a'&&ch<='z')
        {
            System.out.println("it is an alphabet");
        }
        
        else
        {
          System.out.println("not an alphabet");  
        }
    }
}
