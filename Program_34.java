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
public class Program_34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        //calculating sum of natural numbers
        int res=(n*(n+1))/2;
        System.out.println("sum of natural numbers "+res);
        int large=0,rem;
        while(res>0)
        {
           rem=res%10;
           if(rem>large)
           {
               large=rem;
           }
           res=res/10;
            
        }
        System.out.println("largest num of the sum "+ large);
        
    }
    
    
}
