package Evaluation2;

import java.util.*;

public class Expenditure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of days");
		int n = sc.nextInt();
		System.out.println("enter the days");
		int d = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter " + n + " expenditures");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// calculating no of warnings
		int warnings=0;
		int[] temp = new int[d];
		for (int i = d; i < arr.length; i++) {

			temp = Arrays.copyOfRange(arr, i - d, i);
			int median = findMedian(temp, d);
			if(i>=2*median)
			{
			 warnings++;	
			}
			

		}
		System.out.println("total number of warnings the customer will get is"+ warnings);

	}

	// finding median
	public static int findMedian(int[] temp, int d) {
		Arrays.sort(temp);
		
		if (d % 2 == 0) {
			return temp[d / 2] + temp[d / 2 + 1];
		} else {
			return temp[d / 2];
		}

	}

}
