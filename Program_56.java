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
public class Program_56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,k=1,stop,num=0;
        System.out.println("Enter number upto increasing");
        stop=sc.nextInt();
        while(stop>0)
        {
            num++;
            stop-=num;
            
        }
        for(i=1;i<=num;i++)
        {
            for(j=i;j<=num;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println("");
        }
    
   
        
    
        
        
    }
    
}
