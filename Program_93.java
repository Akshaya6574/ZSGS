/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

import java.util.Arrays;

/**
 *
 * @author AKSHAYA
 */
public class Program_93 {
    
        static void sortingarr(char[] arr,int i)
    {
//sort the words using recursion
        int j;
        if(i== arr.length)
            return;
        j=i+1;
        while(j<arr.length)
        {
            if(arr[i]>arr[j])
            {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;
        }
        sortingarr(arr,i+1);
    }
            
    public static void main(String[] args) {
        String str="graduate";
        String result="";
        char[] charstr=str.toCharArray();
        sortingarr(charstr,0);
        
        for(int i=0;i<charstr.length;i++)
        {
          result+=charstr[i];  
        }
        System.out.println(result);
        
        
    }
    }
//version 2
/*
String str="graduate";
char[] arr=str.toCharArray();
Arrays.sort(arr);
System.out.println(String.valueOf(arr));

*/

