package algo.sorting;

public class Bubble implements Sort {
	@Override
	public long[] sort(long[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			boolean swap = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					long temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap = true;
				}

			}
			if (!swap) {
				break;
			}
		}
		return arr;
	}

}
