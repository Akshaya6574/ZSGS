/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */
public class Program_70 {
    public static void main(String[] args) {
        int [] arr = {41, 12, 3, 74, 50}; 
        for(int i=0;i<arr.length-1;i++)
        {
            
          for(int j=i+1;j<arr.length;j++)
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
        System.out.println("second largest number is "+arr[arr.length-2]);
        
        
    }
    
    
}
