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
public class Problem_39 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter"+" "+n+" "+"elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //using bubble sort algorithm
        for(int i=0;i<n;i++)
        {
            int temp;
          for(int j=0;j<n-1;j++)
          {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            
          }
          
          
        }
           
        
            System.out.print("smallest number in the array "+arr[0]);
        
        
    }
}
