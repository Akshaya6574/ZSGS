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
public class Problem_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter choice 1-4");
        int n=sc.nextInt();
        
        System.out.println("enter value of a");
        int a=sc.nextInt();
        System.out.println("enter value of b");
        int b=sc.nextInt();
        
        
        switch(n)
        {
            case 1:
            // i)++a-b--
            
            
                System.out.println("++a-b-- is "+ (++a-b--));
            
                break;
            /*
            (pre increment)++a=>a=4+1 i.e.increment first then use the value
            (post decrement)b--=>5 i.e. use the value first then decrement by 1
            */
            case 2:
            //ii)a%b++
                System.out.println("a%b++ is "+ (a%b++));
                
                break;
                /*
                value of a and b is divided then b is incremented
                */
            case 3:
            //iii)a*=b+5
                System.out.println("a*=b+5 is "+ (a*=b+5));//a=a*(b+5)
                break;
                /*
                multiplication assignment  operator
                first left operand and right operand gets multiplied then it is assigned to the left operand
                */
                
            case 4:
                //iv)x=69>>>2
                int x=69>>>2;
                System.out.println("x=69>>>2 "+ x);
                break;
                
            default:
                System.out.println("invalid choice");
                break;
            
        }
        
        
    }
}
