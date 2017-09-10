package algo.sorting;

public class Merge implements Sort {

	@Override
	public long[] sort(long[] arr) {
		mergeSort(arr, 0, arr.length - 1);
		return arr;
	}

	private void mergeSort(long[] arr, int start, int end) {

		if (end > start) {
			int middle = (start + end) / 2;
			mergeSort(arr, start, middle);
			mergeSort(arr, middle + 1, end);
			merge(arr, start, middle, end);
		}
	}

	private void merge(long[] arr, int start, int middle, int end) {

		int n1 = middle - start + 1;
		int n2 = end - middle;

		long[] l = new long[n1];
		long[] r = new long[n2];

		for (int i = 0; i < n1; i++) {
			l[i] = arr[start + i];
		}
		for (int j = 0; j < n2; j++) {
			r[j] = arr[middle + 1 + j];
		}

		int i = 0;
		int j = 0;
		int k = start;
		while (i < n1 && j < n2) {
			if (l[i] <= r[j]) {
				arr[k] = l[i];
				k++;
				i++;
			} else {
				arr[k] = r[j];
				k++;
				j++;
			}
		}

		while (i < n1) {
			arr[k] = l[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = r[j];
			j++;
			k++;
		}
	}

}
