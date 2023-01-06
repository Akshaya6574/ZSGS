/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */
public class Program_44 {
    public static void main(String[] args) {
        int[] arr={1,3,5,2,8,3,2,7,4,9,3};
        //sorting array using bubble sort
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                int temp;
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //removing duplicates
        int newindex=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]!=arr[i])
            {
                arr[newindex]=arr[i-1];
                newindex++;
            }
        }
        for(int i=0;i<=newindex;i++)
        {
        System.out.print(arr[i]+" ");
        }
    }
}
