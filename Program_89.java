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
public class Program_89 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence/paragraph");
        String str=sc.nextLine();
        String[] strarr = str.split(" ");


        if(strarr.length>=0) {
            for(String strarr1 : strarr)
            
            System.out.print(strarr1 + " ");
        }
    }
    
}
