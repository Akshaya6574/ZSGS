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
public class Problem_14 {
    static int area(int length,int breadth)
    {
        return length*breadth;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the square");
        int length=sc.nextInt();
        System.out.println("enter the length of the square");
        int breadth=sc.nextInt();
        System.out.println("area of Rectangle "+area(length,breadth));
    }
}
