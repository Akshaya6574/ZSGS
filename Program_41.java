/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */
import java.util.Arrays;
import java.util.Scanner;
public class Program_41 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] temp=new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
           temp[i]=arr[i];
          
        }
        System.out.println("copy array ");
        for(int i=0;i<n;i++)
        {
            System.out.println(temp[i]+" ");
           
          
        }
        //method 2
        temp=Arrays.copyOf(arr,arr.length);
        System.out.println("method 2");
        for(int i=0;i<n;i++)
        {
            System.out.println(temp[i]+" ");
           
          
        }
        
    }
      
        
        
    }
    

