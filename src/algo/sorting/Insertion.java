package algo.sorting;

public class Insertion implements Sort {
	@Override
	public long[] sort(long[] arr) {

		for (int i = 0; i < arr.length; i++) {
			long current = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > current) {
				arr[j + 1] = arr[j];
				--j;
			}
			arr[j + 1] = current;
		}

		return arr;
	}

}
