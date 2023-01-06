/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */
import java.util.*;
public class Program_92 {
    static void sortingarr(String[] arr,int i)
    {
//sort the words using recursion
        int j;
        if(i== arr.length)
            return;
        j=i+1;
        while(j<arr.length)
        {
            if(arr[i].charAt(0)>arr[j].charAt(0))
            {
                String temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            else if(arr[i].charAt(0)==arr[j].charAt(0))
            {
                for(int k=1;k<(Math.min(arr[i].length(), arr[j].length()));k++)
                {
                    if(arr[i].charAt(k)>arr[j].charAt(k))
                    {
                        String temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        break;
                        
                    }
                }
            }
            j++;
                   
        }
        sortingarr(arr,i+1);
    }
    public static void main(String[] args) {
        String[ ] arr={"zoho","school","graduate","studies"};
        sortingarr(arr,0);
        System.out.println(Arrays.toString(arr));
        
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