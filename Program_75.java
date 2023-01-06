/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */
public class Program_75 {
    public static void main(String[] args) {
        int[] arr={1,2,7,9,4,10,3};
        
        
        System.out.println("even numbers");
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
            
        }
        System.out.println("");
        System.out.println("odd numbers");
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ");
            }
            
        }
    }
    
}
