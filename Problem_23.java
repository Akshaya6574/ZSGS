/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */
public class Problem_23 {
    public static void main(String[] args) {
        int x=5;
        int x1=++x - x++ +-x;
        System.out.println(x1);
        /*it works under higer order of precedance
    postfix  and prefix operator ranks first
    unary operator ranks second
    multipication ranks third
    addition,subtraction ranks fourth
    */
        
    }
}
