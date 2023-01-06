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
public class Program_47 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the number of rows");
      int rows=sc.nextInt();
      
      for(int i=1;i<=rows;i++)
      {
          for(int space=1;space<=rows-i;space++)
          {
              System.out.print("  ");
              
          }
          int k=0;
          for(int cols=1;cols<=(2*i)-1;cols++)
          {
             if(cols<=i)
               k=k+1;
             else
                 k=k-1;
              System.out.print(k+" ");
              
          }
          System.out.println("");
        }
      //ii)
      for(int i=1;i<=rows;i++)
      {
          for(int space=rows-1;space>=0;space--)
          {
              System.out.print("  ");
          }
              
              for(int cols=1;cols<=(2*i)-1;cols++)
            {
              
              
            }
              
          }
          System.out.println("");
         
          
          
          
      }
    }


