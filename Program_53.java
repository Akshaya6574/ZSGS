
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */
import java.util.Scanner;
public class Program_53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] newstr=str.toCharArray();
        String result="";
        int len=newstr.length,num=0,i,j;
        char ch=newstr[0];
        for(i=1;i<len;i++)
        {
            if(Character.isDigit(newstr[i]))
            {
                result+=newstr[i];
                       
            }
            else
            {
                num=Integer.parseInt(result);
                for(j=1;j<=num;j++)
                {
                    System.out.print(ch);
                }
                result="";
                ch=newstr[i];
            }
        }
        num=Integer.parseInt(result);
        for(i=1;i<=num;i++)
        {
            System.out.print(ch);
        }
                
    }
    
}
