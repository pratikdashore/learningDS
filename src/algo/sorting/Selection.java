package algo.sorting;

public class Selection implements Sort {

	@Override
	public long[] sort(long[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
			if (minIdx > i) {
				long temp = arr[minIdx];
				arr[minIdx] = arr[i];
				arr[i] = temp;
			}
		}
		return arr;
	}

	public static int getIndex(int[] arr, int idx) {
		if (idx >= arr.length) {
			return -1;
		} else {
			if (arr[idx] == idx) {
				return idx;
			} else {
				return getIndex(arr, arr[idx]);
			}
		}
	}

	public static void printBits(int num) {
		if (num <= 1) {
			System.out.print(1);
		} else {
			printBits(num / 2);
			System.out.print(num % 2);
		}
	}

}
