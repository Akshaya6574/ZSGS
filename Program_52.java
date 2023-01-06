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
public class Program_52 {
    static String wordReverse(String str)
    {
        int i = str.length() - 1;
        int start, end = i + 1;
        String result = "";
 
        while (i >= 0) {
            if (str.charAt(i) == ' ') {
                start = i + 1;
                while (start != end)
                    result += str.charAt(start++);
 
                result += ' ';
 
                end = i;
            }
            i--;
        }
 
        start = 0;
        while (start != end)
            result += str.charAt(start++);
 
        return result;
    }
 
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
 
        System.out.print(wordReverse(str));
    }
}
