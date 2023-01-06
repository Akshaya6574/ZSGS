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
public class Program_58 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int m=sc.nextInt();
        n = 2*m;
        
        int stars = n/2 + 1;
        int spaces = 0;
        for(int i = 1;i<= n;i++)
        {
          
          for(int j= 1;j<=stars;j++)
            System.out.print("*");
          for(int j= 1;j<=spaces;j++)
            System.out.print("_");
          for(int j= 1;j<=stars;j++)
            System.out.print("*");
            
        System.out.println();
 
          if(i< n/2 + 1)
          {
            stars -= 1;
            spaces += 2;
          }
          
          if(i == n/2 + 1)
          {
            spaces = n - 3;
            stars = 2;
          }
          
          if(i > n/2 + 1)
          {
            stars += 1;
            spaces -= 2;
          }
          
          
        }
    }
}
