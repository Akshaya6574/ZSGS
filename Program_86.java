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
public class Program_86 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  size");
        int n=sc.nextInt();
        char[] arr=new char[n];
        System.out.println("enter "+n+" characters");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        System.out.println("printing characters");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
