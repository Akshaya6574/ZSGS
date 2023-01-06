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
public class Program_84 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of row of matrix A:");
        int m=sc.nextInt();
        System.out.println("enter the size of cols of matrix A:");
        int n=sc.nextInt();
        
        int[][] arr=new int[m][n];
        
        System.out.println("enter"+" "+m*n+" "+"elements");
        int odd=0,even=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
                if(arr[i][j]%2==0)
                    even++;
                else
                    odd++;
            }
        }
        System.out.println("frequency of odd numbers "+odd);
        System.out.println("frequency of even numbers "+even);
        
        
    }
}
