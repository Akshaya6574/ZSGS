/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

import java.util.Scanner;

/**
 *
 * @author AKSHAYA
 */
public class Program_80 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter the number of rows");
            int m=sc.nextInt();
            System.out.println("enter the number of columns");
            int n=sc.nextInt();
        int arr[][] = new int[m][n];
        
        
            System.out.println("enter "+m*n+" "+" elements");
            int count=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                    if(arr[i][j]==0)
                    {
                        count+=1;
                    }
                }
            }
            int check=(m*n)/2;
            //check whether it is sparse or not
            if(count>check)
                System.out.println("spare array");
            else
                System.out.println("not an sparse array");
    }
    
}
