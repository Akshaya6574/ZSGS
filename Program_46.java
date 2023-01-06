/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */
import java.util.*;
public class Program_46 {
    public static void main(String[] args) {
       // rotate the elements of an array in the right direction

        int i,j;
        int[] arr={9,7,7,3,2,2,5,0,8};
        j=arr[arr.length-1];

        for(i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=j;

        System.out.println(Arrays.toString(arr)); 
    }
}
