package algo.sorting;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		int size = 50000;
		List<Sort> sortList = new ArrayList<>();

		sortList.add(new Bubble());
		sortList.add(new Insertion());
		sortList.add(new Selection());
		sortList.add(new Heap());
		sortList.add(new Quick());
		sortList.add(new Merge());

		long[] arr = getRandomArray(size);

		for (Sort sort : sortList) {
			long[] newArr = new long[size];
			System.arraycopy(arr, 0, newArr, 0, arr.length);
			applySort(newArr, sort, size < 10);
		}
	}

	public static void applySort(long[] arr, Sort sort, boolean print) {
		long start = System.nanoTime();
		if (print) {
			System.out.print("Input :");
			printArr(arr);
		}
		sort.sort(arr);
		if (print) {
			System.out.print("Output :");
			printArr(arr);
		}
		long time = System.nanoTime() - start;
		System.out.println(sort.getClass().getSimpleName() + " sort ==> " + time / 10000);
	}

	public static void printArr(long[] arr) {
		for (long l : arr) {
			System.out.print(l + ", ");
		}
		System.out.println("");
	}

	public static long[] getRandomArray(int size) {
		long[] arr = new long[size];

		for (int i = 0; i < size; i++) {
			long x = Math.round(Math.random() * 100 * i);
			arr[i] = x;
		}

		return arr;
	}
}
