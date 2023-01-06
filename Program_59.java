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
public class Program_59 {
   
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String a=sc.next();
        char[] ac=a.toCharArray();
        System.out.println("enter the substring to be checked");
        String b=sc.next();
        int f;
        char[] bc=b.toCharArray();
        for(int i=0;i<ac.length;i++)
        {
            if(ac[i]==bc[0])
            {
              f=i;
              for(int j=1;j<bc.length;j++)
              {
                  
                  if(ac[++i]!=bc[j])
                  {
                     f=-1; 
                  }
              }
                System.out.println(f);
            }
        }
    }
}
               
           
            
        
        
    

