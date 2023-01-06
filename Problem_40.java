/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */import java .util.Scanner;
public class Problem_40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        //method 1
        System.out.println("elements present in the array is"+" "+n);
        int[] arr=new int[n];
        System.out.println("enter"+" "+n+" "+"elements");
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            count+=1;
        }
        
        //method 2
        System.out.println("elements present in the array is"+" "+arr.length);
        //method 3
         System.out.println("elements present in the array is"+" "+count);
    }
    
}
