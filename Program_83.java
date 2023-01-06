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
public class Program_83 {
    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of row of matrix A:");
        int m=sc.nextInt();
        System.out.println("enter the size of cols of matrix A:");
        int n=sc.nextInt();
        
        int[][] arr=new int[m][n];
        
        System.out.println("enter"+" "+m*n+" "+"elements");
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix A");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("");
        }
        int res[][] = new int[m][n];
        int row, col ;
        
        System.out.print("The matrix elements are : ");
        printMatrix(arr);
        // Loops to store the upper triangular matrix 
        for(row=0;row<3;row++)
            for(col=0;col<3;col++)
            {   
                if(row>col)
                    res[row][col]=0;
                else
                    res[row][col]= arr[row][col];
            }   
        System.out.print("\n\nThe upper triangular matrix : ");
        printMatrix(res);
    }
    // Method to print the matrix
    static void printMatrix(int arr[][])
    {
        int row, col;
        // Loop to print the elements
        for(row=0;row<3;row++)
        {
            // Used for formatting
            System.out.print("\n");
            for(col=0;col<3;col++)
            {
                System.out.print(arr[row][col]+" ");
            }
        }
    }
}
//version 2
/*
public static void main(String[] args) {
        int[][]mat1={{2,3,4},{9,1,5},{3,2,7}};
        int m1=mat1.length,n1=mat1[0].length;
        int i=0,j=0;
       displayUpperTriangularMat(mat1,m1,n1,i,j);


    }

    public static void displayUpperTriangularMat(int[][]mat1,int m1,int n1,int i,int j){

        if(i>=m1){
            return ;
        }
        if(j>=n1){
            j=0;i++;
            System.out.println();
        }

        if(i<m1){
            if(j<n1){
                if(i>j){
                    System.out.print(0+" ");
                }
 else{
                    System.out.print(mat1[i][j]+" ");
                }
                j++;
                displayUpperTriangularMat(mat1,m1,n1,i,j);
            }
        }
        return;
    }
*/