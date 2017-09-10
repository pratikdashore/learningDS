package algo.sorting;

public class Quick implements Sort {

	@Override
	public long[] sort(long[] arr) {
		quickSort(arr, 0, arr.length - 1);
		return arr;
	}

	private void quickSort(long[] arr, int start, int end) {
		if (start < end) {
			int pi = partitian(arr, start, end);
			quickSort(arr, start, pi -1);
			quickSort(arr, pi + 1, end);
		}
	}

	private int partitian(long[] arr, int start, int end) {
		long pivot = arr[end];

		int i = start;
		for (int j = start; j < end; j++) {
			if (arr[j] <= pivot) {
				long temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				++i;
			}
		}

		long temp = arr[i];
		arr[i] = pivot;
		arr[end] = temp;
		return i;
	}

}
