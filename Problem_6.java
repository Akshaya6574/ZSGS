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
public class Problem_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students");
        int num=sc.nextInt();
        System.out.println("enter how many groups");
        int group=sc.nextInt();
        System.out.println("enter the starting roll no");
        int start=sc.nextInt();
        int update=start;
        
        int  num_of_students_in_one_group=num/group;
        if(num%group==0)
        {
            for(int i=1;i<=group;i++)
            {
                System.out.println("group "+i+" :");
                for(int j=1;j<=num_of_students_in_one_group;j++)
                {
                    System.out.println(start+"\t");
                    start+=4;
                }
                System.out.println("");
                start=update+i;
            }   
                    
            
        }
    }
}
