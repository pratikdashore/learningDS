package algo.sorting;

public class Heap implements Sort {

	@Override
	public long[] sort(long[] arr) {

		int n = arr.length;
		// build heap --> bottom up approach
		for(int i = n/2 -1; i >= 0; i--){
			heapify(arr, n, i);
		}
		
		for (long l : arr) {
			System.out.print(l + " ");
		}

		// remove one element and heapify remaining heap
		
		for (int i = n-1; i >= 0; i--) {
			long swap = arr[i];
			arr[i] = arr[0];
			arr[0] = swap;
			heapify(arr, i, 0);
		}

		return arr;
	}

	// i = node index from where heap is going to heapify
	private void heapify(long[] arr, int n, int i) {

		int root = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		
		if(left < n && arr[root] < arr[left]){
			root = left;
		}
		if( right < n && arr[root] < arr[right]){
			root = right;
		}
		if(root != i){
			long swap = arr[i];
			arr[i] = arr[root];
			arr[root] = swap;
			heapify(arr, n, root);
		}

	}

}
