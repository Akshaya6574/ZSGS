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
public class Program_79 {
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
        System.out.print("\n");
    }
    public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number of rows");
            int m=sc.nextInt();
            System.out.println("enter the number of columns");
            int n=sc.nextInt();
        int arr[][] = new int[m][n];
        if(m==n)
        {
            System.out.println("enter "+m*n+" "+" elements");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
        int row, col;
        boolean flag = true;
        
           System.out.print("The matrix elements are:");
        printMatrix(arr);
        // Loops to find transpose of the matrix
        for(row=0;row<3;row++)
            for(col=0;col<3;col++)
            {   
                // Checks whether the primary diagonal elements are 1 or not
                if(row==col)
                {
                    if(arr[row][col]!=1)
                    {
                        flag = false;
                        break;
                    }
                }
                // Checks wether the non-primary diagonal elements are 0 or not
                else
                {
                    if(arr[row][col]!=0)
                    {
                        flag = false;
                        break;
                    }
                }
                
            }
        if(flag)
            System.out.println("\nIt is an identity matrix");
        else
            System.out.println("\nIt is not an identity matrix");
    } 
        
        else
            System.out.println("invalid matrix");
        
        }
}
    
    
    
    
    

