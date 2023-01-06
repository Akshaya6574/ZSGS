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
public class Program_85 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of row of matrix A:");
        int m=sc.nextInt();
        System.out.println("enter the size of cols of matrix A:");
        int n=sc.nextInt();
        
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
                
                    
            }
        }
        System.out.println("printing each row sum");
        int sum=0;
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                
                
                sum=sum+arr[i-1][j-1];
                
                    
            }
            System.out.println("row "+i+" sum is "+sum);
            sum=0;
        }
        System.out.println("printing each column sum");
        for(int i = 0; i < n; i++){    
            sum = 0;    
            for(int j = 0; j < m; j++){    
              sum = sum + arr[j][i];    
            }    
            System.out.println("sum of  " + (i+1) +" column: " + sum);    
        
    }
    }
}
