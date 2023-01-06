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
public class Program_78 {
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
                        C[i][j]=C[i][j]+A[i][k]-B[k][j];
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
//version 2
/*
public static void main(String[] args) {
        int[][]mat1={{2,6,7},{5,8,5}};
        int[][]mat2={{3,8,1},{0,2,5}};
        int m1=mat1.length,n1=mat1[0].length,m2= mat2.length,n2=mat2[0].length;
        int[][]mat3=new int[m1][n1];
        int i=0,j=0;
        int ans=subMat(mat1,mat2,mat3,m1,n1,m2,n2,i,j);

        for(i=0;i<m1;i++){
            for(j=0;j<n1;j++){
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int addMat(int[][]mat1,int[][]mat2,int[][]mat3,int m1,int n1,int m2,int n2,int i,int j){

        if(i>=m1){
            return 0;
        }
        if(j>=n1){
            j=0;i++;
        }
        if(i<m1){
            if(j<n1){
                mat3[i][j]=mat1[i][j]-mat2[i][j];
                j++;
                subMat(mat1,mat2,mat3,m1,n1,m2,n2,i,j);
            }
        }
        return 0;
    }
*/
