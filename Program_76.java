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
public class Program_76 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the row:");
        int r=sc.nextInt();
        System.out.println("enter the size of the column:");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        
         System.out.println("enter"+" "+(r*c)+" "+"elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               arr[i][j]=sc.nextInt(); 
            }
         
        }
        System.out.println("array elements are:");
        
        for(int i=0;i<r;i++)//3
        {
            for(int j=0;j<c;j++)//2
            {
                System.out.print(arr[i][j]+"\t"); 
            }
            System.out.println(" ");
         
        }
        System.out.println(" Transpose of  array :");
        
        for(int i=0;i<c;i++)//3
        {
            for(int j=0;j<r;j++)//2
            {
                System.out.print(arr[j][i]+"\t"); 
            }
            System.out.println(" ");
         
        }
    }
    
}
