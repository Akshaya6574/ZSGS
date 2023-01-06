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
public class Program_81 {
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
        
       //check are they equal
       boolean flag=true;
       for(int i=0;i<m;i++)
        {
            for(int j=0;j<q;j++)
            {
                
                    if(A[i][j]!=B[i][j])
                        flag=false;
                        
                   
            }
            
        }
       if(flag)
            System.out.println("two matrices are equal");
       else
           System.out.println("two matrices are not equal");
    }
}
//version 2
/*
public static void main(String[] args) {
        int[][]mat1={{2,6},{5,8}};
        //int[][]mat2={{3,8},{0,2}};
        int[][]mat2={{2,6},{5,8}};
        int m1=mat1.length,n1=mat1[0].length,m2= mat2.length,n2=mat2[0].length;
        int i=0,j=0;
        boolean answer=true;
        boolean ans = isMat(mat1,mat2,m1,n1,m2,n2,i,j,answer);

        if(ans==true){
            System.out.println("The matrices are equal");
        }
        else{
            System.out.println("The matrices are not equal");
        }



    }

    public static boolean isMat(int[][]mat1,int[][]mat2,int m1,int n1,int m2,int n2,int i,int j,boolean answer){

        if(i>=m1){
            return true;
        }
        if(j>=n1){
            j=0;i++;
        }
        if(i<m1){
            if(j<n1){
                if(mat1[i][j]!=mat2[i][j]){
                    answer=false;
                }
                j++;
                isMat(mat1,mat2,m1,n1,m2,n2,i,j,answer);
            }
        }
        return answer;
    }
*/