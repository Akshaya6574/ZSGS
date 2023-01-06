
package zoho_set_1;

import java.util.Scanner;
public class Program_1 {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int number=sc.nextInt();
        System.out.println("enter the size of the table");
        int size=sc.nextInt();
        
        //multiplication table
        
        System.out.println("multiplication table");
        for(int i=1;i<=size;i++)
        {
            System.out.println(number +"*"+ i +"="+number*i );
        }
        
        //subtraction table
        
        System.out.println("subtraction table");
        
         for(int i=number;i<=size+number-1;i=i+=1)
           {
            int sub=i-number;
            System.out.println(number+"-"+i+"="+sub);
            
           }
        
        
        

        
    }
}
