/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */

public class Program_90 {
    static void sortelements(String []my_str, int n){
      for (int i=1 ;i<n; i++){
         String temp = my_str[i];
         int j = i - 1;
         while (j >= 0 && temp.length() < my_str[j].length()){
            my_str[j+1] = my_str[j];
            j--;
         }
         my_str[j+1] = temp;
      }
   }
    
        
   
   public static void main(String args[]){
       
      String []my_arr = {"zoho", "school", "for", "graduate","studies"};
      int len = my_arr.length;
      sortelements(my_arr,len);
      System.out.print("The sorted array is : ");
      for (int i=0; i<len; i++)
      System.out.print(my_arr[i]+" ");
   }
}

//version 2
/*String[ ] arr={"zoho","school","graduate","studies"};

for(int i=0; i<arr.length(); i++)
        {
            for(int j=1; j<arr.length; j++)
            {
                if(arr[j-1].compareTo(arr[j])>0)
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
         
         
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(names[i]);
        }
*/
    
    

