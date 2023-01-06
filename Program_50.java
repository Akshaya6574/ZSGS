/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */
public class Program_50 {
    public static void main(String[] args) {
        int i,j,n=9,space=0;
        for( i=n;i>0;i--)
        {
            for(j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(j=0;j<i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
            space++;
        }
    }
    
}
