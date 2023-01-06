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
public class Program_91 {
    private static void swapChars(int i, int j, char[] charArray) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] charArray = str.toCharArray();


        
        for (int i = charArray.length-1; i >=0; i--) {
            for (int j = i - 1; j >= 0; j--) 
            {
                if (Character.toLowerCase(charArray[j]) < Character.toLowerCase(charArray[i])) 
                {
                    swapChars(i, j, charArray);
                }
            }
        }

        
        System.out.println("Sorted string " + String.valueOf(charArray));
    }

    
    

}
//version2
/*
String str="graduate";
char[] arr=str.toCharArray();
Arrays.sort(arr);
for(int i=arr.length-1;i>=0;i--)
  System.out.println(String.valueOf(arr));
*/

    

