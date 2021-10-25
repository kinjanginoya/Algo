package demo.demo;

public class InfiniteArray {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
		int target = 160;
		int result = ans(arr, target);
		System.out.println(result);
	}

	static int ans(int[] arr, int target) {

		int start = 0, end = 1;

		while (target > arr[end]) {

			int temp = end + 1;
			end = end + (end - start + 1) * 2;
			start = temp;

		}
		//System.out.println(start + "," + end);
		return binarySearch(arr, target, start, end);
	}

	static int binarySearch(int[] arr, int target, int start, int end) {
		int s = start, e = end;
		// System.out.println(s + "::" + e);
		while (s <= e) {
			int mid = s + (e - s) / 2;

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
