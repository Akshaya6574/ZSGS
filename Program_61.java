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
public class Program_61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the "+n+" elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //method1
        System.out.println("array in reverse order");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        //version 2
        reverse(arr,n);
    }
        //method2
        static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
  
        // printing the reversed array
        System.out.println("method 2 Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.print(b[k]+" ");
        }
    }
  
   
        
        
   }
    

