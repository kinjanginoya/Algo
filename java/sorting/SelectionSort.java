package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 10, 25, 63, 5, 9, 41 };
		int[] result = selection(arr);
		for (int i : result) {
			System.out.print(i + ",");
		}
	}

	private static int[] selection(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}

		return arr;

	}

}
