package sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 10, 25, 63, 5, 9, 41 };
		int[] result = bubbleSortMethod(arr);
		for (int i : result) {
			System.out.print(i + ",");
		}
	}

	private static int[] bubbleSortMethod(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		return arr;

	}

}
