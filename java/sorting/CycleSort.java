package sorting;

import java.util.Arrays;

public class CycleSort {

	public static void main(String[] args) {
		int arr[] = { 10, 25, 63, 5, 9, 41 };
		System.out.println(Arrays.toString(selection(arr)));

	}

	private static void swap(int[] arr, int first, int sec) {

		int temp = arr[first];
		arr[first] = arr[sec];
		arr[sec] = temp;
		// return null;
	}

	private static int[] selection(int[] arr) {
		int i = 0;

		while (i < arr.length) {
			int correct = arr[i] - 1;

			if (arr[i] < arr.length && arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}

		}

		return arr;

	}

}
