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
public class Problem_98 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the small case character");
        char input=sc.next().charAt(0);
        System.out.println(Character.toUpperCase(input));
        //version 2
        /*
        int ascii=(int)input;
        ascii=-32;
        char capital=(char)ascii;
        System.out.print(capital);
                
        */
    }
    
}
