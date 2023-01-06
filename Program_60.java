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
public class Program_60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n=sc.nextInt();
        
        if(n<0)
        {
            System.out.println("invalid input");
        }
        else
        {
            int i,num=0,sum=0;
            
                    for( i=1;i<=n;i++)
                    {
                     num=num*10+1;
                     sum+=num;
                     
                    }
                    System.out.println("sum is "+sum);
            {
            }
        }
    }
    
}
