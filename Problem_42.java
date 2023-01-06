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
public class Problem_42 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        System.out.println("array elements are");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("enter the element to check the frequency");
        int search=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(search==arr[i])
                count+=1;
        }
        System.out.println("frequency of the element "+count );
        
        
    }
}
