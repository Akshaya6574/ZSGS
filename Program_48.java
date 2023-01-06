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
public class Program_48 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      System.out.println("enter the number of rows");
      int n=sc.nextInt();
      int i,j;
      for(i=n;i>=1;i--)
      {
          for(j=1;j<=i;j++)
          {
              System.out.print("  ");
          }
          
          for(j=i;j<=n;j++)
          {
              System.out.print(j+" ");
          }
          for(j=n-1;j>=i;j--)
          {
              System.out.print(j+" ");
          }
          System.out.println("");
      }
    }
    
}
