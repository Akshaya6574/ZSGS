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

public class Program_97 {
    static int check(char[]charstr,char search)
    {
        int low=0,high=charstr.length-1,mid;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(charstr[mid]==search)
            {
                return mid;
            }
            else if(charstr[mid]<search)
            {
              low=mid+1;  
            }
            else if(charstr[mid]>search)
            {
                high=mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.next();
        char[] charstr=str.toCharArray();
        
        System.out.println("enter the character to be searched");
        char search=sc.next().charAt(0);
        //implementing binary search
        int result=check(charstr, search);
        System.out.println(result);
        
        
        
        
    }
    
}
