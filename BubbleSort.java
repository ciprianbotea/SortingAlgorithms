package sorting_algorithms;

public class BubbleSort {
	
	private int [] bubbleSortArray = {};
	
	public BubbleSort() {
		bubbleSortArray = new int [] {5, 3, 9, 11, 7};
	}

	public BubbleSort(int [] bubbleSortArray) {
		this.bubbleSortArray = bubbleSortArray;
	}

	public int[] getBubbleSortArray() {
		return bubbleSortArray;
	}

	public void setBubbleSortArray(int[] bubbleSortArray) {
		this.bubbleSortArray = bubbleSortArray;
	}
	
	public void bubbleSort () {
		boolean flag = true;
		
		while (flag) {
			flag = false;
			for (int i = 0; i < bubbleSortArray.length - 1; i++) {
			if (bubbleSortArray[i] > bubbleSortArray[i + 1]) {
				flag = true;
				swap(i);
			}
				
			}
		}
		
	}

	private void swap(int i) {
		int temp = bubbleSortArray[i];
		bubbleSortArray[i] = bubbleSortArray[i + 1];
		bubbleSortArray[i + 1] = temp;
	}	
	

}
