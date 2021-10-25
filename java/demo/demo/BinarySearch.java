package demo.demo;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { -6, -3, -1, 1, 3, 5, 6, 7, 9, 10, 59, 60, 100 };
		int target = -1;
		int result = binarySearch(arr, target);
		System.out.println(result);
	}

	static int binarySearch(int[] arr, int target) {
		int s = 0, e = arr.length - 1;
		System.out.println(s + "::" + e);
		while (s <= e) {
			int mid = s + (e - s) / 2;
			/*
			 * if (arr[mid] == target) { return mid; } if (target > arr[s] && target <
			 * arr[mid]) { e = mid; } else { s = mid; }
			 */
			if (target < arr[mid]) {
				e = mid - 1;
			} else if (target > arr[mid]) {
				s = mid + 1;
			} else {
				return mid;
			}

		}
		return -1;
	}

}
