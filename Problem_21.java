/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */
public class Problem_21 {
    public static void main(String[] args) {
        int y=10;
        int z=(++y *(y++ + 5));
        System.out.println(z);
        /*it works under higer order of precedance
    postfix  and prefix operator ranks first
    unary operator ranks second
    multipication ranks third
    addition ranks fourth
    */
    }
}
