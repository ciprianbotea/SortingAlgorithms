package sorting_algorithms;
import java.util.Random;

public class App {
    
	public static void main(String[] args) {
		
		BubbleSort bubble = new BubbleSort();
		QuickSort quick = new QuickSort();
		Random random = new Random();
		
		int [] arr = new int [10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		
		bubble.setBubbleSortArray(arr);
		quick.setQuickSortArray(arr);
		
		for (int i = 0; i < bubble.getBubbleSortArray().length; i++) {
			System.out.print(bubble.getBubbleSortArray()[i] + " ");
		}
		
		System.out.println("\n---");
		
		bubble.bubbleSort();
		quick.quickSort(0, arr.length-1);
		
		for (int i = 0; i < bubble.getBubbleSortArray().length; i++) {
			System.out.print(bubble.getBubbleSortArray()[i] + " ");
		}
		
		System.out.println("\n---");
		
		for (int i = 0; i < quick.getQuickSortArray().length; i++) {
			System.out.print(quick.getQuickSortArray()[i] + " ");
		}

	}

}