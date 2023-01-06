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
public class Problem_15 {
    static double area(double radius,double height)
    {
        return (2*3.14*radius*height)+(2*3.14*(radius*radius));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of the cylinder");
        double radius=sc.nextDouble();
        System.out.println("enter the height of the cylinder");
        double height=sc.nextDouble();
        
        System.out.println("area of cylinder "+area(radius,height));
    }
}
