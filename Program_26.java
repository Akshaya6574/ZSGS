/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */
public class Program_26 {
    public static void main(String[] args) {
        //int keyword is a data type stores numbers from -2147483648 to 2147483647
        //long keyword  is a data type stores numbers from -9223372036854775808 to 9223372036854775807
        int num=1000000*1000000;
        System.out.println("numeric overflow due to the usage of int data type:  1000000*1000000 = "+num );
        long num1=1000000*1000000L;
        System.out.println("while using long data type we get the correct answer :  1000000*1000000 = "+num );
    }
    
}
