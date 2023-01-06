/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */

public class Program_65 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,6,7,3};
        int count=1;
        for(int i=0;i<arr.length;i++)
        {
            
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count+=1;
                }
                
            }
            
            System.out.println ("frequency of "+arr[i]+" "+count);
            count=1;
            
                    
        }
    }
    
}
