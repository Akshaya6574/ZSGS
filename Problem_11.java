/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */
public class Problem_11 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        //function call to rotate the matrix(left rotate)
        int[][]leftRotateMatrix=leftRotate(matrix);
        System.out.println("original matrix");
        printMatrix(matrix);
        System.out.println("left rotated  matrix");
        printMatrix(leftRotateMatrix);
        
        
    }
    public static int[][] leftRotate(int[][]matrix)
    {
      int[][] lrotatemat=new int[matrix[0].length][matrix.length];
      int i,j;
      for(i=0;i<matrix.length;i++)
      {
          for(j=0;j<matrix.length;j++)
          {
            lrotatemat[i][j]=matrix[j][matrix[0].length-1-i];
            
          }
      }
      return lrotatemat;
    }
    //printing
    public static void printMatrix(int[][] matrix)
    {
        int i,j;
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
