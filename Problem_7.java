/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;
import java.util.Scanner;
public class Problem_7 {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number in odd count");
        String str=sc.next();
        int n=str.length();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
               if(i==j)
               {
                   System.out.print(str.charAt(count));  
               }
               else if(i+j==n+1)
               {
                 System.out.print(str.charAt(count));  
               }
               else
               {
                   System.out.print(" ");
               }
            }
            System.out.println();
            count+=1;
        }
    }
}
