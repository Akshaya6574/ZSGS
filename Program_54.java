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
public class Program_54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+" elements");
        //getting input
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("");
        
        //printing arr elements
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        
        //making as negative in the position of odd 
        //arr starts with position 1
        
        for(int i=1;i<=n;i++)
        {
            if((i%2)!=0)
            {
                arr[i-1]=-(arr[i-1]);
            }
        }
        //after making it as negative 
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        //sorting
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp;
            if(arr[i]>arr[j])
            {
              temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
            }
            }
            
            
        }
        //after sorting
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        //removing -
        int oddcount=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                arr[i]=-(arr[i]);
                oddcount+=1;
            }
            
            
        }
        
        System.out.println("odd count "+oddcount);
        //arr after removing -
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        int start=0;
        int[] arr2=new int[n];
        for(int i=0;i<n;i++)
        {
            if(i<oddcount)
            {
              if (start<n)
              {
                  arr2[start]=arr[i];
                  
              }
              start+=2;
            }
            
            else
            {
                start=1;
                while(i<n)
                {
                    if(start<n)
                    {
                       arr2[start]=arr[i]; 
                    }
                    i++;
                    start+=2;
                }
            }
            
        }
        
        //finalarray
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr2[i]+",");
        }
        
        
        
    }
    
}
