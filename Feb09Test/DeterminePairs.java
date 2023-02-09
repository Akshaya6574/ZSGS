package Evaluation2;


import java.util.*;

public class DeterminePairs {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int target = 4;

		System.out.println(combinationSumMethod(arr, target));
	}

	public static List<List<Integer>> combinationSumMethod(int[] arr, int target) {
		List<Integer> res = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		helper(0, arr, target, res, ans);
		return ans;

	}

	public static void helper(int ind, int[] arr, int target, List<Integer> res, List<List<Integer>> ans) {
		if (target == 0) {
			ans.add(new ArrayList<>(res));
			return;
		}

		for (int i = ind; i < arr.length; i++) {
				target -= arr[i];
				if (target >= 0) {
					res.add(arr[i]);
					helper(i + 1, arr, target, res, ans);
					res.remove(res.size() - 1);
				}
				target += arr[i];
			}
		}
	}


