package zSkill;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	public int[] MeanMedian(int[] arr, int length) {
		double diff = 0;
		double mean = 0;
		double median = 0;
		int n = length;
		double sets = (1 << n);
		List<Integer> ls = new ArrayList<Integer>();
		for (int i = 1; i <= sets; i++) {
			int[] subset = findSubset(i, arr);
			mean = findMean(subset);
			median = findMedian(subset);
			if (diff < (mean - median)) {
				diff = mean - median;
				ls.removeAll(ls);
				for (int val : subset) {
					ls.add(val);
				}
			}
		}

		int[] result = new int[ls.size()];
		int i = 0;
		for (int val : ls) {
			result[i] = val;
			i++;
		}

		return result;
	}

	public double findMean(int[] arr) {
		int n = arr.length;
		double sum = 0;
		if (n == 0)
			return 0;
		for (int i = 0; i < n; i++)
			sum += arr[i];
		return (sum / n);
	}

	public double findMedian(int[] arr) {
		int n = arr.length;
		if (n % 2 == 1)
			return arr[(n / 2)];
		else if (n >= 2)
			return 0.5 * (arr[((n - 2) / 2)] + arr[n / 2]);
		else
			return 0;
	}

	public int[] findSubset(int counter, int[] arr) {
		int n = arr.length;
		List<Integer> ls = new ArrayList<Integer>();
		for (int j = 0; j < n; j++) {
			if ((counter & (1 << j)) > 0) {
				ls.add(arr[j]);
			}
		}
		int[] output = new int[ls.size()];
		for (int j = 0; j < ls.size(); j++) {
			output[j] = ls.get(j);
		}
		return output;
	}
}
