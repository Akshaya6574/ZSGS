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
public class Program_62 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        
        System.out.println("enter "+size+" elements");
        for(int i=0;i<size;i++)
        {
           arr[i]=sc.nextInt();
        }
        System.out.println("elements present on even positions");
        for(int i=0;i<size;i++)
        {
            if(i%2==0)
            System.out.print(arr[i]+" ");
            
        }
        System.out.println("");
        System.out.println("elements present on odd positions");
        for(int i=0;i<size;i++)
        {
            if(i%2!=0)
            System.out.print(arr[i]+" ");
            
        }
        
    }
    
}
