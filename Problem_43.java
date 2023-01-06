/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */
import java .util.Scanner;
public class Problem_43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int[] arr={1,2,3,4,5,6,7};
     
      
      
        System.out.println("how many times it has to rotate");
        int n=sc.nextInt();
        int left=0;
        int right=arr.length-1-n;
        int nextleft=right+1;
        int nextright=arr.length-1;
        int temp;
        while(left<right)
        {
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
            
        }
        left=0;
        right=arr.length-1;
        while(nextleft<nextright)
        {
            temp=arr[nextleft];
            arr[nextleft]=arr[nextright];
            arr[nextright]=temp;
            nextleft++;
            nextright--;
        }
         
        while(left<right)
        {
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
            
        
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" "); 
        }
        
       
       
       
     
      
    }
    
}
