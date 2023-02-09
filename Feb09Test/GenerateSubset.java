package Evaluation2;

import java.util.*;
import java.util.Scanner;

public class GenerateSubset {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		Arrays.sort(arr);

		System.out.println(SumMethod(arr));

	}

	public static List<List<Integer>> SumMethod(int[] arr) {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> res = new ArrayList<>();
		helper(0, arr, res, ans);
		return ans;

	}

	public static void helper(int ind, int[] arr, List<Integer> res, List<List<Integer>> ans) {
		if (ind == arr.length) {

			ans.add(new ArrayList<>(res));
			return;
		}

		res.add(arr[ind]);

		helper(ind+1, arr, res, ans);
		res.remove(res.size() - 1);

		helper(ind + 1, arr, res, ans);

	}

}
