package sorting_algorithms;

public class QuickSort {
	
	private int [] quickSortArray = {};
	
	public QuickSort() {
		quickSortArray = new int [] {5, 3, 9, 11, 7};
	}

	public QuickSort(int [] quickSortArray) {
		this.quickSortArray = quickSortArray;
	}

	public int[] getQuickSortArray() {
		return quickSortArray;
	}

	public void setQuickSortArray(int[] quickSortArray) {
		this.quickSortArray = quickSortArray;
	}
	
	public void quickSort (int low, int high) {
		if (low >= high) {
			return;
		}
		int pivot = quickSortArray[high];
		int left = low;
		int right = high;
		
		while (left < right) {
			while (quickSortArray[left] <= pivot && left < right) {
				left++;
			}
			while (quickSortArray[right] >= pivot && right > left) {
				right--;
			}
			
			swap(left, right);
		}
		swap(left, high);
		
		quickSort(low, left-1);
		quickSort(right + 1, high);
		
	
	}
	
	private void swap(int i, int j) {
		int temp = quickSortArray[i];
		quickSortArray[i] = quickSortArray[j];
		quickSortArray[j] = temp;
	}	


}
