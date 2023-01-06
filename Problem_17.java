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
public class Problem_17 {
    static double area(double rad1,double rad2)
    {
        return 3.14*(rad1+rad2)*(rad1-rad2);
    }
    public static void main(String[] args) {
        
    
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radii of 1st circle");
        double rad1=sc.nextInt();
        System.out.println("enter the radii of 2nd circle");
        double rad2=sc.nextInt();
        System.out.println("area between the two concentric circles is  "+area(rad1,rad2));
    }
    }

