package Evaluation2;

import java.util.Scanner;

public class InsertionSorting {

	
		public static void main(String[] args) {
			 Scanner sc=new Scanner(System.in);
		     System.out.println("enter the size of the array");
		     int n=sc.nextInt();
		     int[] a=new int[n];
		     System.out.println("enter"+" "+n+" "+"elements");
		     for(int i=0;i<n;i++)
		     {
		         a[i]=sc.nextInt();
		     }
		     System.out.println("array elements are (BEFORE SORTING)");
		     for(int i=0;i<n;i++)
		     {
		         System.out.print(a[i]+" ");
		     }
		     System.out.println("");
		     //implementing insertion sort
		     for(int i=1;i<a.length;i++)
		     {
		    	int currElement=a[i];
		    	int j=i-1;
		    	while(j>=0&&a[j]>currElement)
		    	{
		    		a[j+1]=a[j];
		    		
		    		j--;
		    	}
		    	a[j+1]=currElement;
		    	
		     }
		     System.out.println("array elements are (AFTER SORTING)");
		     for(int i=0;i<n;i++)
		     {
		         System.out.print(a[i]+" ");
		     }

		


	}

}
