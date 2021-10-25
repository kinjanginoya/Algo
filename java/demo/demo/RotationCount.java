package demo.demo;

public class RotationCount {

	public static void main(String[] args) {

		// int arr[] = { 3, 5, 6, 7, 9, 10, 59, 60, 100, 101, -6, -1, 1, 2 };
		int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 1;
		int s = 0, e = 0;
		int result = Pivot(arr);
		System.out.println(result + 1);

	}

	static int Pivot(int[] arr) {
		int s = 0, e = arr.length - 1;

		while (s <= e) {
			int mid = s + (e - s) / 2;

			if (mid < e && arr[mid + 1] < arr[mid]) {
				return mid;
			}

			if (mid > s && arr[mid - 1] > arr[mid]) {
				return mid - 1;
			}
			if (arr[mid] <= arr[s]) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}

			/*
			 * if (arr[s] > arr[s + 1]) { return s; } s++; if (arr[e] < arr[e - 1]) { return
			 * e; } e--;
			 */
		}
		return -1;
	}

}
