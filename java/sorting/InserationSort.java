package sorting;

import java.util.Arrays;

public class InserationSort {

	public static void main(String[] args) {
		int arr[] = { 10, 25, 63, 5, 9, 41 };
		System.out.println(Arrays.toString(selection(arr)));

	}

	private static int[] selection(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;
				}
			}

		}

		return arr;

	}

}
