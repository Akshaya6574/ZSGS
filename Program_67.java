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

public class Program_67 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] a =new int[n];
        System.out.println("enter "+n+"elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("sorted array");
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp;
                if (a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        
        }
        for(int i =0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        
        System.out.println("duplicates:");
        
        
        for(int i=0;i<n-1;i++)
        {
            if(a[i]==a[i+1])
            {
                System.out.print(a[i]+" ");  
                
            }
        }
        
        
        

        
                
    }
}
