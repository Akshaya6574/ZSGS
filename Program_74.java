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
public class Program_74 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of row of matrix A:");
        int m=sc.nextInt();
        System.out.println("enter the size of cols of matrix A:");
        int n=sc.nextInt();
        
        int[][] A=new int[m][n];
        
        System.out.println("enter"+" "+m*n+" "+"elements");
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix A");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }
        
        System.out.println("enter the size of row of matrix B:");
        int p=sc.nextInt();
        System.out.println("enter the size of cols of matrix B:");
        int q=sc.nextInt();
        
        int[][] B=new int[p][q];
        
        System.out.println("enter"+" "+p*q+" "+"elements");
        
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
            {
                B[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix B");
        for(int i=0;i<p;i++)
        {
            for(int j=0;j<q;j++)
            {
                System.out.print(B[i][j]+"\t");
            }
            System.out.println("");
        }
        
        int[][] C=new int[m][q];
        if(m==q)
        {
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<q;j++)
                {
                    C[i][j]=0;
                    for(int k=0;k<n;k++)
                    {
                        C[i][j]=C[i][j]+A[i][k]*B[k][j];
                    }
                }
            }
        }
        System.out.println("matric C");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<q;j++)
            {
                System.out.print(C[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
