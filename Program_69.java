/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoho_set_1;

/**
 *
 * @author AKSHAYA
 */
public class Program_69 {
    public static void main(String[] args) {
        //Initialize array   
        int [] arr = {1, 2, 3, 4, 5};   
        //n determine the number of times an array should be rotated  
        int n = 1;  
          
        //original array  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");   
        }    
          
        //Rotate the given array by n times toward left  
        for(int i = 0; i < n; i++){  
            int j, last;  
            //temporarily Stores the first element of the array  
            last = arr[arr.length-1];  
          
            for(j= arr.length-1;j>0; j--){  
                //Shift element of array by one  
                arr[j] = arr[j-1];  
            }  
            //last element of array will be added to the first  
            arr[0] = last;  
        }  
          
        System.out.println();  
          
        //Displays resulting array after rotation  
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        } 
    }
}
