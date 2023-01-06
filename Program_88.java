/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

import java.util.Scanner;

/**
 *
 * @author AKSHAYA
 */
import java.util.Scanner;
public class Program_88 {
    
       
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = 0; i <str.length();i++) {
            if(str.charAt(i)==' ') {
                System.out.println();
                continue;
            }
            System.out.print(str.charAt(i));
        }
        sc.close();
        
    }
}
