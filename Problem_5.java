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
public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char ch=sc.next().toLowerCase().charAt(0);
        int ascii=(int)ch;
        int pos=ascii-96;
        for(int i=pos;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");  
            }
            --ch;
            System.out.println("");
        }
        
        
        
    }
    
}
