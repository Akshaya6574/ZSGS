package Evaluation2;

import java.util.Scanner;

public class Icecream {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter " + n + " elements");
		for (int i = 1; i <= n; i++) {
			arr[0] = sc.nextInt();
		}
		System.out.println("enter the cost");
		int m = sc.nextInt();

		int ind1 = 0, ind2 = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == m) {
					ind1 = i;
					ind2 = j;

				}
			}

		}
		System.out.println("cost "+(ind1 + 1) + " and" + (ind2 + 1)+" meet the criteria");

	}

}
