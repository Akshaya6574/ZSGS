/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

import java.util.*;
public class Problem_9 {
    public static void main(String[] args) {
        TreeSet<Integer>new_arr=new TreeSet<>();
        int arr1[]={2,4,5,6,7,9,10,13},arr2[]={2,3,4,5,6,7,8,9,11,15};
        int i=0,j=0;
        while(i<arr1.length)
        {
            new_arr.add(arr1[i]);
            i++;
        }
        while(j<arr2.length)
        {
            new_arr.add(arr2[j]);
            j++;
        }
        System.out.println(new_arr);
       
        
    }
    
}
