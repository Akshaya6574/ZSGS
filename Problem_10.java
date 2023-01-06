/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;


public class Problem_10 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=arr.length;
        
        
        for(int pos=0;pos<n;pos+=2)
        {
          int temp=arr[n-1];//storing temporarly the maximum value
          for(int i=n-1;i>pos;i--)
          {
              arr[i]=arr[i-1];//performing right shift
          }
              arr[pos]=temp;//storing max 
        
        }   
        //printing alterate sorted array
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+",");
        }
        
        
        
    }
    
}
